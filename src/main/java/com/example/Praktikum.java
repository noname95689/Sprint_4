package com.example;
import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Введите имя и фамилию");
        String name = user_input.nextLine();
        Account account = new Account(name);
        if (account.checkNameToEmboss() == true) {
            System.out.println(name);
        } else {
            System.out.println("Введите допустимое имя");
        }
    }
}
