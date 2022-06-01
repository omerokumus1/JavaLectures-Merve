package Ch1_ElementaryProgramming;

public class Ch1_1_TypeConversion {
    public static void main(String[] args) {
        // int -> double
        int x = 4;
        double y = (double) x;

        // double -> int
        x = (int) y;

        // int, double etc -> String
        String str = String.valueOf(3);
        str = String.valueOf('c');
        str = String.valueOf(3.14);
        str = String.valueOf(true);

        str = 3 + "";
        str = 'x' + "";
        str = 3.14 + "";
        str = true + "";

        // String -> int: verilen string tam sayı olmalı yoksa hata verir
        x = Integer.parseInt("51");

        // String -> double: verilen string double ya da tam sayı olmalı
        y = Double.parseDouble("3.14");
        y = Double.parseDouble("2");

        // char -> int
        x = (int) 'a';
        System.out.println("x: " + x);

        // int -> char
        char c = (char) 97;
        System.out.println("c: " + c);

        System.out.println(Character.getName(97));
        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue(97));
        System.out.println(Character.valueOf((char) 97));


    }
}
