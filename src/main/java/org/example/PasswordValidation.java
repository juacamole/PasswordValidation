package org.example;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = "";
        boolean  lengthIf;
        boolean numIf;
        boolean upperLowercaseTest;
        boolean originalPw;
        boolean specialChar;

        //Engine
        System.out.println("Hello, would you like write your own password or generate one?");
        String input = sc.nextLine();
        if (input.equals("Generate")){
            System.out.println("great, how long would you like  the password to be?");
            do {
                System.out.print("Please enter the length of you password: ");
                int length = sc.nextInt();
                pw = pwGenerator(length,pw);
            } while (pw.equals("zu kurz"));
            System.out.print("Here is your Password:     ");
            System.out.print(pw);
            } else
            do {
                System.out.println("Your password has to meet the criteria:");
                System.out.println("Atleast 8 Characters long");
                System.out.println("You have  to includeUppercase and Lowercase Characters");
                System.out.println("You have to include atleast one number");
                System.out.println("You have to include atleast one special character");
                System.out.println("You may not use a simple password");
                System.out.print("Write your password here: ");
                pw = sc.next();
                lengthIf = lenghTest(pw);
                numIf = numberTest(pw);
                upperLowercaseTest = UpperLowercaseTest(pw);
                originalPw = givenPwTest(pw);
                specialChar = specialCharTest(pw);
            }while (!lengthIf && !numIf && !upperLowercaseTest && originalPw && specialChar);
            System.out.println("Great, you have succesfully created a password");
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
            if (pw.equals(givenPws[i])) {
                return true;
            }
        }

        return false;
    }

    public static boolean specialCharTest(String pw) {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    public static String pwGenerator(int length, String pw) {
        int random = 0;
        if (length >=  8) {
            char[] randomPw;
            do {
                randomPw = new char[length + 1];

                for (int i = 0; i <= length; i++) {
                    random = (int) (Math.random() * 62 + 1);

                    switch (random) {
                        case (1) -> randomPw[i] = 'a';
                        case (2) -> randomPw[i] = 'b';
                        case (3) -> randomPw[i] = 'c';
                        case (4) -> randomPw[i] = 'd';
                        case (5) -> randomPw[i] = 'e';
                        case (6) -> randomPw[i] = 'f';
                        case (7) -> randomPw[i] = 'g';
                        case (8) -> randomPw[i] = 'h';
                        case (9) -> randomPw[i] = 'i';
                        case (10) -> randomPw[i] = 'j';
                        case (11) -> randomPw[i] = 'k';
                        case (12) -> randomPw[i] = 'l';
                        case (13) -> randomPw[i] = 'm';
                        case (14) -> randomPw[i] = 'n';
                        case (15) -> randomPw[i] = 'o';
                        case (16) -> randomPw[i] = 'p';
                        case (17) -> randomPw[i] = 'q';
                        case (18) -> randomPw[i] = 'r';
                        case (19) -> randomPw[i] = 's';
                        case (20) -> randomPw[i] = 't';
                        case (21) -> randomPw[i] = 'u';
                        case (22) -> randomPw[i] = 'v';
                        case (23) -> randomPw[i] = 'w';
                        case (24) -> randomPw[i] = 'x';
                        case (25) -> randomPw[i] = 'y';
                        case (26) -> randomPw[i] = 'z';
                        case (27) -> randomPw[i] = 'A';
                        case (28) -> randomPw[i] = 'B';
                        case (29) -> randomPw[i] = 'C';
                        case (30) -> randomPw[i] = 'D';
                        case (31) -> randomPw[i] = 'E';
                        case (32) -> randomPw[i] = 'F';
                        case (33) -> randomPw[i] = 'G';
                        case (34) -> randomPw[i] = 'H';
                        case (35) -> randomPw[i] = 'I';
                        case (36) -> randomPw[i] = 'J';
                        case (37) -> randomPw[i] = 'K';
                        case (38) -> randomPw[i] = 'L';
                        case (39) -> randomPw[i] = 'M';
                        case (40) -> randomPw[i] = 'N';
                        case (41) -> randomPw[i] = 'O';
                        case (42) -> randomPw[i] = 'P';
                        case (43) -> randomPw[i] = 'Q';
                        case (44) -> randomPw[i] = 'R';
                        case (45) -> randomPw[i] = 'S';
                        case (46) -> randomPw[i] = 'T';
                        case (47) -> randomPw[i] = 'U';
                        case (48) -> randomPw[i] = 'V';
                        case (49) -> randomPw[i] = 'W';
                        case (50) -> randomPw[i] = 'X';
                        case (51) -> randomPw[i] = 'Y';
                        case (52) -> randomPw[i] = 'Z';
                        case (53) -> randomPw[i] = '1';
                        case (54) -> randomPw[i] = '2';
                        case (55) -> randomPw[i] = '3';
                        case (56) -> randomPw[i] = '4';
                        case (57) -> randomPw[i] = '5';
                        case (58) -> randomPw[i] = '6';
                        case (59) -> randomPw[i] = '7';
                        case (60) -> randomPw[i] = '8';
                        case (61) -> randomPw[i] = '9';
                        case (62) -> randomPw[i] = '0';

                    }
                }
            } while (numberTest(pw) != false || UpperLowercaseTest(pw) != false || givenPwTest(pw) != false);
            pw = new String(randomPw);
            return pw;
        }
        else return "Zu Kurz";
    }
    public static char randomChar (int number){
        int i  = 0;
        char[]  randomPw = new char[1];
        switch (number) {
            case (1) -> randomPw[i] = 'a';
            case (2) -> randomPw[i] = 'b';
            case (3) -> randomPw[i] = 'c';
            case (4) -> randomPw[i] = 'd';
            case (5) -> randomPw[i] = 'e';
            case (6) -> randomPw[i] = 'f';
            case (7) -> randomPw[i] = 'g';
            case (8) -> randomPw[i] = 'h';
            case (9) -> randomPw[i] = 'i';
            case (10) -> randomPw[i] = 'j';
            case (11) -> randomPw[i] = 'k';
            case (12) -> randomPw[i] = 'l';
            case (13) -> randomPw[i] = 'm';
            case (14) -> randomPw[i] = 'n';
            case (15) -> randomPw[i] = 'o';
            case (16) -> randomPw[i] = 'p';
            case (17) -> randomPw[i] = 'q';
            case (18) -> randomPw[i] = 'r';
            case (19) -> randomPw[i] = 's';
            case (20) -> randomPw[i] = 't';
            case (21) -> randomPw[i] = 'u';
            case (22) -> randomPw[i] = 'v';
            case (23) -> randomPw[i] = 'w';
            case (24) -> randomPw[i] = 'x';
            case (25) -> randomPw[i] = 'y';
            case (26) -> randomPw[i] = 'z';
            case (27) -> randomPw[i] = 'A';
            case (28) -> randomPw[i] = 'B';
            case (29) -> randomPw[i] = 'C';
            case (30) -> randomPw[i] = 'D';
            case (31) -> randomPw[i] = 'E';
            case (32) -> randomPw[i] = 'F';
            case (33) -> randomPw[i] = 'G';
            case (34) -> randomPw[i] = 'H';
            case (35) -> randomPw[i] = 'I';
            case (36) -> randomPw[i] = 'J';
            case (37) -> randomPw[i] = 'K';
            case (38) -> randomPw[i] = 'L';
            case (39) -> randomPw[i] = 'M';
            case (40) -> randomPw[i] = 'N';
            case (41) -> randomPw[i] = 'O';
            case (42) -> randomPw[i] = 'P';
            case (43) -> randomPw[i] = 'Q';
            case (44) -> randomPw[i] = 'R';
            case (45) -> randomPw[i] = 'S';
            case (46) -> randomPw[i] = 'T';
            case (47) -> randomPw[i] = 'U';
            case (48) -> randomPw[i] = 'V';
            case (49) -> randomPw[i] = 'W';
            case (50) -> randomPw[i] = 'X';
            case (51) -> randomPw[i] = 'Y';
            case (52) -> randomPw[i] = 'Z';
            case (53) -> randomPw[i] = '1';
            case (54) -> randomPw[i] = '2';
            case (55) -> randomPw[i] = '3';
            case (56) -> randomPw[i] = '4';
            case (57) -> randomPw[i] = '5';
            case (58) -> randomPw[i] = '6';
            case (59) -> randomPw[i] = '7';
            case (60) -> randomPw[i] = '8';
            case (61) -> randomPw[i] = '9';
            case (62) -> randomPw[i] = '0';
        }
        return randomPw[0];
    }
}