package org.example;


import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        String str;
        int num;
        Translation trans = new Translation();
        String greeting = trans.getGreeting(Locale.FRANCE);

        System.out.printf("technikumm wien!");

    }
}
