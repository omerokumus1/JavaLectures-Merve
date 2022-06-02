package Ch6_SingleDimensionalArrays;

public class Ch6_1_ArraysIntro {
    public static void main(String[] args) {
        // Declaring an array
        // dataType[] arrName;
        int[] ints;
        double[] doubles;
        String[] strings;
        char[] chars;

        // Creating an array
        // arrName = new dataType[SIZE];
        ints = new int[10];
        doubles = new double[5];
        strings = new String[100];
        chars = new char[26];

        // tek satırda declaration and creation
        int[] numbers = new int[15];

        // Arrayler indexlenebilir yapılardır.
        // Arrayin 0. indexine eleman atama
        numbers[0] = 2;
        numbers[3] = 7;

        // Arrayin bir indexindeki elemanı okuma
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[3]: " + numbers[3]);

        //*** Array boyu sabittir değişmez. Program çalışırken ilk oluşturulduğu gibi kalır.

        // array default değerler: array oluşturulunca tüm elemanlar otomatik olarak data tipine göre bir değere atanır
        // mesela bu değer int arrayde 0 olur.
        System.out.println("numbers[1]: " + numbers[1]);

        // Arrayi belirli değerlerle oluşturma
        int[] nums = {1, 2, 3, 4, 5}; // otomatik olarak 5 boyutlu array oluşturulup elemanlar sırayla assign edilir
        System.out.println("nums[0]: " + nums[0]);
        System.out.println("nums[1]: " + nums[1]);
        System.out.println("nums[2]: " + nums[2]);
        System.out.println("nums[3]: " + nums[3]);
        System.out.println("nums[4]: " + nums[4]);


    }
}
