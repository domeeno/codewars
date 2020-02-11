package com.company;

public class DuplicateEncoder {
    static String encode(String word){
        StringBuilder repeatedChars = new StringBuilder();
        StringBuilder encodedString = new StringBuilder();
        String character;
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            character = "" + word.charAt(i);

            if(word.substring(i+1).contains(character)) {
                repeatedChars.append(word.charAt(i));
            }

        }

        for(int i = 0; i < word.length(); i++){
            character = "" + word.charAt(i);
            if(repeatedChars.toString().contains(character)) {
                encodedString.append(")");
            } else {
                encodedString.append("(");
            }
        }

        word = encodedString.toString();
        return word;
    }
}
