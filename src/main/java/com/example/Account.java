package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name.length() < 3) {
            System.out.println("Имя слишком короткое");
            return false;
        } else if (name.length() > 19) {
            System.out.println("Имя слишком длинное");
            return false;
        } else if (name.startsWith(" ")) {
            System.out.println("Имя не может начинаться пробелом");
            return false;
        } else if (name.endsWith(" ")) {
            System.out.println("Имя не может заканчиваться пробелом");
            return false;
        } else if (name.contains(" ")) {
            System.out.println("Имя корректное");
            return true;
        } else {
            System.out.println("Имя и фамилия должны быть разделены пробелом");
            return false;
        }
    }
}

