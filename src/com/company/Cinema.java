//package com.company;
//
//import java.util.Arrays;
//
//public class Cinema {
//    public static String Tickets(int[] peopleInLine)
//    {
//        int token25 = 0, token50 = 0;
//
//        Arrays.sort(peopleInLine);
//
//        for (int value : peopleInLine) {
//            if (value == 25) {
//                token25++
//            } else if (value == 50) {
//                token50++;
//                token25--;
//                if (token25 < 0) {
//                    return "NO";
//                }
//            } else {
//                if (token50 > 0) {
//                    token50--;
//                }
//
//                while(value != 25){
//                    value -= token25;
//                    token25--;
//
//                    if(token25 < 0){
//                        return "NO";
//                    }
//                }
//            }
//        }
//
//        return "YES";
//    }
//}
