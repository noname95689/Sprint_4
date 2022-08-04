package com.example;
import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Scanner user_input = new Scanner(System.in);
        System.out.println("Введите имя и фамилию");
        String name = user_input.nextLine();
        System.out.println(name);
        Account account = new Account(name);
        account.checkNameToEmboss();
    }
}
