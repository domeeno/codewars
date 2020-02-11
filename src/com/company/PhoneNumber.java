package com.company;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        String formatPhoneNumber;
        for (int i = 0; i < numbers.length; i++) {
            if(i == 0){
                phoneNumber.append("(");
            } else if (i == 3) {
                phoneNumber.append(") ");
            } else if (i == 6) {
                phoneNumber.append("-");
            }

            phoneNumber.append(numbers[i]);
        }
        formatPhoneNumber = phoneNumber.toString();
        return formatPhoneNumber;
    }

    public static String createPhoneNumberSmart(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}
