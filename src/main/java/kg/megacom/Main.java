package kg.megacom;

import com.google.gson.Gson;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import kg.megacom.microservice.OkHttpConnection;
import kg.megacom.models.Person;
import kg.megacom.models.Hobby;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {


        OkHttpConnection connection = new OkHttpConnection();
        String response = connection.getJson();

        Gson gson = new Gson();

        Type personListType = new TypeToken<List<Person>>() {
        }.getType();

        List<Person> personList = gson.fromJson(response, personListType);


        //person1
        List<Person> person1 = personList.stream()
                .limit(2)
                .filter(person -> person.getId() == 1)
                .collect(Collectors.toList());
        person1.forEach(System.out::println);

        //hobby person1
        // person1.stream().map(person -> person.getHobby()).forEach(System.out::println);

        Map<List<Hobby>, List<Person>> getPerson1 = person1.stream()
                .collect(Collectors.groupingBy(Person::getHobby));

        getPerson1.forEach((hobbies, person) -> {
            person.stream()
                    .map(Person::getFistName)
                    .forEach(System.out::println);

            hobbies.forEach(System.out::println);
            System.out.println();

        });


//        //person2
        List<Person> person2 = personList.stream()
                .limit(2)
                .filter(person -> person.getId() == 2)
                .collect(Collectors.toList());
        person2.forEach(System.out::println);
        //hobby person2
      //  person1.stream().map(person -> person.getHobby()).forEach(System.out::println);
        Map<List<Hobby>, List<Person>> getPerson2 = person2.stream()
                .collect(Collectors.groupingBy(Person::getHobby));

        getPerson2.forEach((hobbies, person) -> {
            person.stream()
                    .map(Person::getFistName)
                    .forEach(System.out::println);

            hobbies.forEach(System.out::println);
            System.out.println();

        });

//        JSONObject jsonObject = XML.toJSONObject(response);
//        System.out.println(jsonObject);
//        System.out.println(XML.toString(jsonObject));

//        User[] user = gson.fromJson(response, User[].class);
//        Arrays.stream(user).forEach(System.out::println);
//        List<User> userList = new ArrayList<User>(Arrays.asList(user));
//        userList.stream().forEach(System.out::println);


    }
}
