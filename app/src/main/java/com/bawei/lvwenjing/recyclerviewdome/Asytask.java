package com.bawei.lvwenjing.recyclerviewdome;

import android.os.AsyncTask;

import com.bawei.lvwenjing.recyclerviewdome.utils.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lenovo-pc on 2017/5/21.
 */

public class Asytask extends AsyncTask<Object, Void, String> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Object... params) {
        String path = (String) params[0];
        //获取网络
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(20000);
            connection.setReadTimeout(20000);
            if (connection.getResponseCode() == 200) {
                InputStream inputStream = connection.getInputStream();
                String input = Utils.getInput(inputStream);
                return input;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
