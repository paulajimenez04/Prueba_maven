package com.jimenezsanjose;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Paula", "Jimenez", 21, "paula@gmail.com");
        Gson gson = new Gson();
        String json = gson.toJson(persona);
        System.out.format(json);
    }
}