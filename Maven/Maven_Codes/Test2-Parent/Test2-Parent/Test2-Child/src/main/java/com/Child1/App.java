package com.Child1;

import com.google.gson.Gson;

import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        https://www.learncodewithdurgesh.com/blogs/maven-tutorial

        System.out.println("Hello World!");
        Gson gson = new Gson();
        System.out.println(gson.toJson(Map.of("message","working fine")));

    }



}
