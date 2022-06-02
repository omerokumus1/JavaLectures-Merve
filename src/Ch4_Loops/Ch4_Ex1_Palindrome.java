package Ch4_Loops;

import java.util.Scanner;

public class Ch4_Ex1_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        // Çözüm-1: Stringin tersini alıp kontrol et
//        String reverseStr = "";
//        int lastIndex = str.length() - 1;
//        for (int i = lastIndex; i >= 0; i--) {
//            reverseStr += str.charAt(i);
//        }
//        if (str.equals(reverseStr)) {
//            System.out.println(str + " is a palindrome");
//        } else {
//            System.out.println(str + " is not a palindrome");
//        }

        // Çözüm-2: Stringe sondan ve baştan başlayıp sırayla kontrol yap
        boolean isPalindrome = true;
        int lastIndex = str.length() - 1;
        for (int i = 0, j = lastIndex; i < str.length() - 1; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }
}
