package org.example.sprint_3.a_09_pesel;

public class Pesel {
    public static boolean validatePesel(String pesel) {
        if (pesel.length() != 11) {
            return false;
        }
        char[] chars = pesel.toCharArray();
        int controlSum = Integer.parseInt(String.valueOf(chars[0])) +
                Integer.parseInt(String.valueOf(chars[1])) * 3 +
                Integer.parseInt(String.valueOf(chars[2])) * 7 +
                Integer.parseInt(String.valueOf(chars[3])) * 9 +
                Integer.parseInt(String.valueOf(chars[4])) +
                Integer.parseInt(String.valueOf(chars[5])) * 3 +
                Integer.parseInt(String.valueOf(chars[6])) * 7 +
                Integer.parseInt(String.valueOf(chars[7])) * 9 +
                Integer.parseInt(String.valueOf(chars[8])) +
                Integer.parseInt(String.valueOf(chars[9])) * 3;

        String controlSumStr = String.valueOf(controlSum);
        int controlSumLastChar = Integer.parseInt(String.valueOf(controlSumStr.charAt(controlSumStr.length() - 1)));
        String controlSumLastCharAfterSubstr = String.valueOf(10 - controlSumLastChar);
        return pesel.charAt(pesel.length() - 1) == controlSumLastCharAfterSubstr.charAt(controlSumLastCharAfterSubstr.length() - 1);
    }
}
