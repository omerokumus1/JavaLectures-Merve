package Ch5_Methods;

public class Ch5_2_PassByValue {
    public static void main(String[] args) {
        // pass by value ne zaman gerçekleşir?: primitive datalar (int, double etc) methodlara gönderilirken pass-by-value olarak gönderilir
        // yani kopyası gönderilir. kopya üzerinde yapılan işlemler gönderilen yerdeki orijinal değişkende gözükmez
        int n = 6;
        increment(n);
        System.out.println("in main method n: " + n);
        n = increment2(n);
    }

    public static void increment(int n) {
        n++; // buradaki n main method içinde n değişkenin kopyasıdır. Bundan sebep burada yapılan değişiklik mainde gözükmez
            // yani maindeki n değişkeni etkilenmez
        System.out.println("in increment method: " + n);
    }

    public static int increment2(int n) {
        n++;
        return n;
    }
}
