package com.sda.zdjavapol92.dp.cbytes;

public class Main {
//    Have the function MissingDigit(str) take the str parameter, which will be a simple mathematical
//    formula with three numbers, a single operator (+, -, *, or /) and an equal sign (=)
//    and return the digit that completes the equation. In one of the numbers in the equation,
//    there will be an x character, and your program should determine what digit is missing.
//    For example, if str is "3x + 12 = 46" then your program should output 4.
//
//    The x character can appear in any of the three numbers and all three numbers will be
//    greater than or equal to 0 and less than or equal to 1000000.

//Examples
//Input: "4 - 2 = x"
//Output: 2
//Input: "1x0 * 12 = 1200"
//Output: 0

    public static String MissingDigit(String str) {
        for (int i = 0; i <= 9; i++) {
            String podstawione = str.replace("x", String.valueOf(i));
            if(isOk(podstawione)){
                return String.valueOf(i);
            }
        }

        return str;
    }

    private static boolean isOk(String equasion) {
        String[] splits = equasion.split(" ");
        double pierwszyEl = Double.parseDouble(splits[0]);
        double drugiEl = Double.parseDouble(splits[2]);
        double poRownaSie = Double.parseDouble(splits[4]);

        String dzialanie = splits[1];
        if (dzialanie.equals("+")) {
            return (pierwszyEl + drugiEl) == poRownaSie;
        } else if (dzialanie.equals("-")) {
            return (pierwszyEl - drugiEl) == poRownaSie;
        } else if (dzialanie.equals("*")) {
            return (pierwszyEl * drugiEl) == poRownaSie;
        } else if (dzialanie.equals("/")) {
            return (pierwszyEl / drugiEl) == poRownaSie;
        }
        throw new UnsupportedOperationException("nie dziala");
    }


    public static void main(String[] args) {
        System.out.println(MissingDigit("4 - 2 = x"));;
    }
}
