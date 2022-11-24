package kg.megacom.microservice;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class OkHttpConnection {

    public String getJson() {

        String url = "https://jsonplaceholder.typicode.com/posts";

        OkHttpClient client = new OkHttpClient();
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Request request = new Request.Builder()
                .url(url)
                .build();

        Call call = client.newCall(request);

        Response response;

        try {
            response = call.execute();
            System.out.println("response code: " + response.code());
            return response.body().string();

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
