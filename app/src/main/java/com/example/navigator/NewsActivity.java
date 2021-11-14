package com.example.navigator;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.adapter.NewsCardAdapter;
import com.example.navigator.models.NewsCard;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 * Представляет экран новостей.
 */
public class NewsActivity extends NavigationActivity {
    RecyclerView newsCardRecycler;
    NewsCardAdapter newsCardAdapter;
    private String jsona = "";

    /**
     * Инициализирует экран новостей.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        new MyTask().execute();

//        try {
//            final String url = "http://10.0.2.2:8080/news";
//            RestTemplate restTemplate = new RestTemplate();
//            restTemplate.getMessageConverters();
//            //String s = restTemplate.getForObject(url, String.class);
//            jsona = restTemplate.getForObject(url, String.class);
//        } catch (Exception e) {
//            Log.e("Activity", e.getMessage(), e);
//        }
        List<NewsCard> cards = new ArrayList<>();
        
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            cards = objectMapper.readValue(jsona, new TypeReference<ArrayList<NewsCard>>() { });///todo сделать другой конвертер или найти
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        setNewsCardRecycler(cards);
        setNavBar();
    }

    class MyTask extends AsyncTask<Void, Void, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
        @Override
        protected String doInBackground(Void... params) {
            HttpClient httpClient = new DefaultHttpClient();
            HttpGet httpPost = new HttpGet("http://10.0.2.2:8080/news");

            try {
                HttpClient httpclient = new DefaultHttpClient();
                HttpResponse response = httpclient.execute(new HttpGet("http://10.0.2.2:8080/news"));

                ByteArrayOutputStream out = new ByteArrayOutputStream();
                response.getEntity().writeTo(out);
                jsona = out.toString();
                out.close();
//
            }
            catch (ClientProtocolException e){
                //textView.setText("CPE");
                System.out.println(e.toString());
            }
            catch (IOException e) {
               // textView.setText("IOE");
                System.out.println(e.toString());
            }
            catch (Exception e) {
               // textView.setText(e.toString());
                System.out.println(e.toString());
            }
            return jsona;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            jsona = result;
        }
    }

    private void setNewsCardRecycler(List<NewsCard> cards) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        newsCardRecycler = findViewById(R.id.newsCardRecycler);

        newsCardRecycler.setLayoutManager(layoutManager);

        newsCardAdapter = new NewsCardAdapter(this, cards);
        newsCardRecycler.setAdapter(newsCardAdapter);
    }
}
