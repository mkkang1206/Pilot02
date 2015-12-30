package com.example.user.pilot02;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONObject;

public class ListViewLayout extends LinearLayout {

    Context mContext;
    private ListView listView;
//    private ArrayList<IconItem> itemList;
    private ItemListAdapter adapter;
    private OkHttpClient client = null;

    TextView deSubject;
    ViewPager pager = MainActivity.pager;
    View mainView;
    private LayoutInflater mInflater;

    Button menuBtn;

    private int mPosition = 0;
    private String title = "";
    private String getImage = "";
    JSONObject jsono;
    JSONArray jsonArray;
    JasonData temp;
    Gson gson;
    public ListViewLayout(Context context) {
        super(context);
        init(context);
    }

    public ListViewLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(final Context context) {
        mContext = context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.list_view, this, true);

//        itemList = new ArrayList<>();
        adapter = new ItemListAdapter(context);

        listView = (ListView)findViewById(R.id.listView);

    }

    public void seturlInput(final String urlStr) {
        new AsyncTask<String , Integer, String >(){
            @Override
            protected String doInBackground(String... params) {
                try{
                    client = new OkHttpClient();
                    Request request = new Request.Builder().url(urlStr).build();
                    Response response = client.newCall(request).execute();
                    return response.body().string();
                } catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                try{
                    jsono = new JSONObject(result);
                    jsonArray = jsono.getJSONArray("data");
                    gson = new Gson();
                    for (int i = 0; i<jsonArray.length(); i++){
                        temp = gson.fromJson(jsonArray.get(i).toString(), JasonData.class);
                        System.out.println("ANSWER ITEM1 = " + temp);


                        adapter.addItem(new IconItem(temp.getTHUMB_URL(),temp.getSUBJECT(),temp.getREG_DT(),temp.getVIEW_COUNT()));

                    }
                    listView.setAdapter(adapter);

                    mInflater = LayoutInflater.from(mContext);

                    //---------김민규---------//
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            Log.d("clickEvent", adapter.getmTitle(position));
                            mPosition = position;
                            DetailView detailView = MainActivity.detailView;

                            detailView.setTitle(adapter.getmTitle(position).toString());

                            detailView.setImage(adapter.getmImage(position).toString());

                            pager.setCurrentItem(2);

                        }
                    });

                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.execute();
    }

    public int getmPosition(){
        return mPosition;
    }

    public void setmPosition(int position){
        mPosition = position;
    }

    public ListView getListView() {
        return listView;
    }
}
