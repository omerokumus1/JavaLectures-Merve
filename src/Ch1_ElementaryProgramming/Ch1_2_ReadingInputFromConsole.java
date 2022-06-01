package Ch1_ElementaryProgramming;

import java.util.Scanner;

public class Ch1_2_ReadingInputFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ezber

        // reading int from console
//        System.out.print("Enter an integer: ");
//        int x = scanner.nextInt();
//        System.out.println("Entered integer: " + x);

        // reading double from console
//        System.out.println("Enter a double: ");
//        double d = scanner.nextDouble();
//        System.out.println("Entered double: " + d);

        // reading string from console
//        System.out.println("Enter a string: ");
//        String str = scanner.nextLine();
//        System.out.println("Entered string: " + str);


        // Güvenli input almak: sadece nextLine kullan -> sayıyı önce string olarak al sonra integer'a cast et
        // nextLine ile integer sayı almak
        System.out.println("Enter an integer: ");
        String str = scanner.nextLine();
        int x = Integer.parseInt(str);
        System.out.println("Entered integer: " + x);

        // double için Double.parseDouble kullanılır






    }
}
