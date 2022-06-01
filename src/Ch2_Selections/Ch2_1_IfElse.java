package Ch2_Selections;

import java.util.Scanner;

public class Ch2_1_IfElse {
    public static void main(String[] args) {
        /* BMI Example
            BMI < 18.5 Underweight
            18.5 ≤ BMI < 25.0 Normal
            25.0 ≤ BMI < 30.0 Overweight
            30.0 ≤ BMI Obese
         */

        Scanner input = new Scanner(System.in);

        double weight, height;

        System.out.println("Enter weight in kg: ");
        weight = input.nextDouble();
        System.out.println("Enter height in m: ");
        height = input.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI: " + Math.round(bmi * 100) / 100.0);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi < 25) {
            System.out.println("Normal");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("Overweight");
        } else
            System.out.println("Obese");

    }
}
