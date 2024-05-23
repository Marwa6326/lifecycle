package org.example;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class TranslationTest {
    @Test
    void when_LocalGerman_then_Hallo(){
        //arrange
        Translation greetingTranslator = new Translation();
        Locale locale = Locale.GERMAN;
        //act
        String greeting = Translation.getGreeting(locale);
        //test
        assertEquals("Hallo",greeting);
    }
    @Test
    void when_LocalFrance_then_Bonjour(){
        //arrange
        Locale locale = Locale.FRANCE;
        //act
        String greeting = Translation.getGreeting(locale);
        //assert
        assertEquals("Bonjour",greeting);
    }

    @Test
    void when_notSupported_then_Exception(){
        //arrange
        Locale locale = new Locale("es","ES");
        //assert
        assertThrows(IllegalArgumentException.class,
                () -> Translation.getGreeting(locale));
    }

}