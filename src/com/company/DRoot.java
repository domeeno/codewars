package com.company;

public class DRoot {
    public static int digitalRoot(int n) {
        String number = Integer.toString(n);
        int result = 0;
        while(number.length() > 1){
            result = 0;
            for(int i = 0; i < number.length(); i++){
                result += Character.getNumericValue(number.charAt(i));
            }
            number = Integer.toString(result);
        }

        return result;
    }
}
