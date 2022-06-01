package Ch2_Selections;

import java.util.Scanner;

public class Ch2_2_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0: System.out.println("monkey"); break;
            case 1: System.out.println("rooster"); break;
            case 2: System.out.println("dog"); break;
            case 3: System.out.println("pig"); break;
            case 4: System.out.println("rat"); break;
            case 5: System.out.println("ox"); break;
            case 6: System.out.println("tiger"); break;
            case 7: System.out.println("rabbit"); break;
            case 8: System.out.println("dragon"); break;
            case 9: System.out.println("snake"); break;
            case 10: System.out.println("horse"); break;
            default: System.out.println("sheep"); // else gibidir. yukarıdaki case'lerden herhangi biri çalışmazsa bu çalışır
        }

        char c = (char) (year % 26 + 97);
        switch (c) {
            case 'a':
                System.out.println("a"); break;
            case 'b':
                System.out.println("b"); break;
            default:
                System.out.println("not a or b"); break;
        }



    }
}
