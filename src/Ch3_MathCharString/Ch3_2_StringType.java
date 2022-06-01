package Ch3_MathCharString;

public class Ch3_2_StringType {
    public static void main(String[] args) {
        String str = "Java programming.";
        System.out.println("length: " + str.length());
        System.out.println("0. char: " + str.charAt(0));
        System.out.println("2. char: " + str.charAt(2));
        System.out.println("upper case: " + str.toUpperCase());
        System.out.println("lower case: " + str.toLowerCase());
        System.out.println("contains J: " + str.contains("J"));
        System.out.println("contains Jx: " + str.contains("Jx"));
        System.out.println("equals: " + str.equals("Java programming."));
        System.out.println("equals ignore case: " + str.equalsIgnoreCase("java programming."));
        System.out.println("concat: " +  str.concat(" is fun.") );

    }
}
