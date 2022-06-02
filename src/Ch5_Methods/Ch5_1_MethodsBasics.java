package Ch5_Methods;

import java.util.Scanner;

public class Ch5_1_MethodsBasics {
    public static void main(String[] args) {
        addTwoIntegers(-3, 52);
        int sum = addTwoIntegers2(3, 5);
        System.out.println("sum: " + sum);

        System.out.println("concat of java and prog: " + concatStrings("java", " prog"));
    }

    public static void addTwoIntegers(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("sum: " + sum);
    }

    public static int addTwoIntegers2(int n1, int n2) {
        return n1 + n2;
    }

    public static String concatStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
