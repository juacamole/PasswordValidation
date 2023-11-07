package org.example;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = sc.next();
        boolean lenghIf = lenghTest(pw);
        System.out.println(lenghIf);
        boolean numIf = numberTest(pw);
        System.out.println(numIf);
        boolean  upperLowercaseTest = UpperLowercaseTest(pw);
        System.out.println(upperLowercaseTest);
    }
    public static boolean lenghTest (String pw){
        if (pw.length() >= 8){
            return true;
        }
        return false;
    }
    public static boolean numberTest(String pw){
        boolean ifNum = pw.matches(".*\\d+.*");
        return ifNum;
    }

    public static boolean UpperLowercaseTest (String pw) {
        boolean hasUpperCase = !pw.equals(pw.toLowerCase());
        boolean hasLowerCase = !pw.equals(pw.toUpperCase());
        if (hasUpperCase && hasLowerCase) {
            return true;
        } else {
            return false;

        }

    }
}