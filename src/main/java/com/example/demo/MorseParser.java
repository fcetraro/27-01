package com.example.demo;

public class MorseParser {
    private static String decode (String toEncode) {
        String morse = toEncode;

        if (toEncode.equalsIgnoreCase(".-"))
            morse = "a";
        if (toEncode.equalsIgnoreCase("-..."))
            morse = "b";
        if (toEncode.equalsIgnoreCase("-.-."))
            morse = "c";
        if (toEncode.equalsIgnoreCase("-.."))
            morse = "d";
        if (toEncode.equalsIgnoreCase("."))
            morse = "e";
        if (toEncode.equalsIgnoreCase("..-."))
            morse = "f";
        if (toEncode.equalsIgnoreCase("--."))
            morse = "g";
        if (toEncode.equalsIgnoreCase("...."))
            morse = "h";
        if (toEncode.equalsIgnoreCase(".."))
            morse = "i";
        if (toEncode.equalsIgnoreCase(".---"))
            morse = "j";
        if (toEncode.equalsIgnoreCase("-.-"))
            morse = "k";
        if (toEncode.equalsIgnoreCase(".-.."))
            morse = "l";
        if (toEncode.equalsIgnoreCase("--"))
            morse = "m";
        if (toEncode.equalsIgnoreCase("-."))
            morse = "n";
        if (toEncode.equalsIgnoreCase("---"))
            morse = "o";
        if (toEncode.equalsIgnoreCase(".--."))
            morse = "p";
        if (toEncode.equalsIgnoreCase("--.-"))
            morse = "q";
        if (toEncode.equalsIgnoreCase(".-."))
            morse = "r";
        if (toEncode.equalsIgnoreCase("..."))
            morse = "s";
        if (toEncode.equalsIgnoreCase("-"))
            morse = "t";
        if (toEncode.equalsIgnoreCase("..-"))
            morse = "u";
        if (toEncode.equalsIgnoreCase("...-"))
            morse = "v";
        if (toEncode.equalsIgnoreCase(".--"))
            morse = "w";
        if (toEncode.equalsIgnoreCase("-..-"))
            morse = "x";
        if (toEncode.equalsIgnoreCase("-.--"))
            morse = "y";
        if (toEncode.equalsIgnoreCase("--.."))
            morse = "z";
        if (toEncode.equalsIgnoreCase("-----"))
            morse = "0";
        if (toEncode.equalsIgnoreCase(".----"))
            morse = "1";
        if (toEncode.equalsIgnoreCase("..---"))
            morse = "2";
        if (toEncode.equalsIgnoreCase("...--"))
            morse = "3";
        if (toEncode.equalsIgnoreCase("....-"))
            morse = "4";
        if (toEncode.equalsIgnoreCase("....."))
            morse = "5";
        if (toEncode.equalsIgnoreCase("-...."))
            morse = "6";
        if (toEncode.equalsIgnoreCase("--..."))
            morse = "7";
        if (toEncode.equalsIgnoreCase("---.."))
            morse = "8";
        if (toEncode.equalsIgnoreCase("----."))
            morse = "9";
        if (toEncode.equalsIgnoreCase("|"))
            morse = "";

        return morse;
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
        String newEnglish = "";
        String selectedEnglish;
        String convertedEnglish;
        String[] morseChars = morseWord.split(" ");
        for (int i = 0; i < morseChars.length; i++)
        {
            selectedEnglish = morseChars[i];
            boolean endsWithWordSeparator = selectedEnglish.endsWith("|");
            if(endsWithWordSeparator) selectedEnglish = selectedEnglish.substring(0, selectedEnglish.length() - 1);
            convertedEnglish = decode(selectedEnglish);
            newEnglish = newEnglish + convertedEnglish;
            if (endsWithWordSeparator)
            {
                newEnglish = newEnglish + " ";
            }
        }
        return newEnglish;
    }
}
