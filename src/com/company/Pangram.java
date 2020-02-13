package com.company;

public class Pangram {
    public static boolean isPangram(String str1){
        String str2 = "abcdefghijklmnopqrstuvwxyz";
        if (str2.length() > str1.length()) return false;

        str1 = str1.replaceAll("\\s+","");
        str1 = str1.replaceAll("\\W","");
        str1 = str1.toLowerCase();
        System.out.println(str1);

        for (String s: str2.split("")) {
            if (!str1.contains(s))  return false;
            str2 = str2.replaceFirst(s,"");
        }

        return true;
    }
}
