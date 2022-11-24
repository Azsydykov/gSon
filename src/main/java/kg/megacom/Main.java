package kg.megacom;


import com.google.gson.Gson;
import kg.megacom.microservice.OkHttpConnection;
import kg.megacom.models.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        OkHttpConnection connection = new OkHttpConnection();

        String response = connection.getJson();
        // System.out.println(response.toString());

        Gson gson = new Gson();


        User[] user = gson.fromJson(response, User[].class);

           Arrays.stream(user).forEach(System.out::println);
        List<User> userList = new ArrayList<User>(Arrays.asList(user));
     //   userList.stream().forEach(System.out::println);


    }
}
