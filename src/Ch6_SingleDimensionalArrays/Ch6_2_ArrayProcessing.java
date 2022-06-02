package Ch6_SingleDimensionalArrays;

import java.util.Scanner;

public class Ch6_2_ArrayProcessing {
    public static void main(String[] args) {
        sumAllElements();
    }

    // 4. Summing all elements:
    public static void sumAllElements() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);
    }

    // 2. Initializing arrays with random values:
    public static void initArrayWithRandomValues() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        printArray(numbers);
    }

    // 1. Initializing arrays with input values
    public static void initArrayWithInputs() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = input.nextInt();
        }
        printArray(numbers);
    }

    // 3. Displaying arrays
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
    }

}
