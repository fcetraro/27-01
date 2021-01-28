package com.example.demo.model;

import java.util.HashMap;

public class MorseParser {
    static HashMap<String, String> hm = new HashMap<String, String>();

    public MorseParser() {
        hm.put(".-","a");
        hm.put("-...","b");
        hm.put("-.-.","c");
        hm.put("-..","d");
        hm.put(".","e");
        hm.put("..-.","f");
        hm.put("--.","g");
        hm.put("....","h");
        hm.put("..","i");
        hm.put(".---","j");
        hm.put("-.-","k");
        hm.put(".-..","l");
        hm.put("--","m");
        hm.put("-.","n");
        hm.put("---","o");
        hm.put(".--.","p");
        hm.put("--.-","q");
        hm.put(".-.","r");
        hm.put("...","s");
        hm.put("-","t");
        hm.put("..-","u");
        hm.put("...-","v");
        hm.put(".--","w");
        hm.put("-..-","x");
        hm.put("-.--","y");
        hm.put("--..","z");
        hm.put("-----","0");
        hm.put(".----","1");
        hm.put("..---","2");
        hm.put("...--","3");
        hm.put("....-","4");
        hm.put(".....","5");
        hm.put("-....","6");
        hm.put("--...","7");
        hm.put("---..","8");
        hm.put("----.","9");
        hm.put("|","");
    }

    private static String decode (String toEncode) {
        if(hm.containsKey(toEncode)) return hm.get(toEncode);
        System.out.println("Caracter no identificado");
        return "";
    }
    public static String parseMorse(String morseCode){
        String[] morseWords = morseCode.split("   ");
        String parsedPhrase = "";
        for (String word: morseWords) {
            parsedPhrase = parsedPhrase + " " + parseWord(word);
        }
        return parsedPhrase;
    }
    static String parseWord(String morseWord){
        String[] morseWords = morseWord.split(" ");
        String parsedWord = "";
        for (String word: morseWords) {
            parsedWord = parsedWord + decode(word);
        }
        return parsedWord;
    }
}
