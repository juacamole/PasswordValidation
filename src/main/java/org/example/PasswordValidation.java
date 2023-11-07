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
        boolean upperLowercaseTest = UpperLowercaseTest(pw);
        System.out.println(upperLowercaseTest);
    }

    public static boolean lenghTest(String pw) {
        return pw.length() >= 8;
    }

    public static boolean numberTest(String pw) {
        boolean ifNum = pw.matches(".*\\d+.*");
        return ifNum;
    }

    public static boolean UpperLowercaseTest(String pw) {
        boolean hasUpperCase = !pw.equals(pw.toLowerCase());
        boolean hasLowerCase = !pw.equals(pw.toUpperCase());
        if (hasUpperCase && hasLowerCase) {
            return true;
        } else {
            return false;

        }

    }

    public static boolean givenPwTest(String pw) {
        String[] givenPws = new String[3];
        givenPws[0] = "P@ssw0rd42";
        givenPws[1] = "Password123";
        givenPws[2] = "Pasword123";

        for (int i = 0; i < givenPws.length; i++) {
            if (pw.equals(givenPws[i])){
                return false;
            }
        }

        return true;
    }

    public static boolean specialCharTest(String pw){
        return pw.matches(".*[^a-zA-Z0-9].*");
    }
}