package com.company;

public class Scramble {
    public static boolean scrambler(String str1, String str2){
        str1 = str1.toLowerCase();
        StringBuilder string1 = new StringBuilder();
        String character;

        string1.append(str1.toLowerCase());

        for(int i = 0; i < str2.length(); i++) {
            character = "" + str2.charAt(i);
            if(!str1.contains(character)){
                return false;
            } else {
                try {
                    string1.setCharAt(string1.indexOf(character), '-');
                } catch (Exception e) {
                    return false;
                }
            }
        }

        return true;
    }
}
