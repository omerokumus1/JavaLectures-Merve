package Ch3_MathCharString;

public class Ch3_1_MathClass {
    public static void main(String[] args) {
        Math.round(24.4);
        Math.pow(3, 2);
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.max(3, 6));
        System.out.println(Math.min(3, 6));

        // Rastgele sayı üretmek
        double r1 = Math.random(); // 0 <= r1 < 1
        double r2 = Math.random() * 10; // 0 <= r2 < 10
        double r3 = Math.random() * 10 + 10; // 10 <= r3 < 20
        double r4 = Math.random() * 10 - 5; // -5 <= r4 < 5
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);

        System.out.println("int r1: " + (int)r1);
        System.out.println("int r2: " + (int)r2);
        System.out.println("int r3: " + (int)r3);
        System.out.println("int r4: " + (int)r4);


    }
}
