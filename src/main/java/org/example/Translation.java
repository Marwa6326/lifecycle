package org.example;

import java.util.Locale;

public class Translation {
    public static String getGreeting(Locale locale){
        if(Locale.GERMAN == locale)
            return "Hallo";
        if(Locale.FRANCE == locale)
            return "Bonjour";
        throw new IllegalArgumentException("Language not supported");
    }
}
