package com.company;

public class CountBits {
    public static int countBits(int n){
        String binaryN;
        int c = 0;
        
        binaryN = Integer.toBinaryString(n);
        
        for (int i = 0; i < binaryN.length(); i++) {
            if(binaryN.charAt(i) == '1'){
                c++;
            }
        }

        return c;
    }
}
