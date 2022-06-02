package Ch5_Methods;

public class Ch5_4_ScopeOfVariables {
    public static void main(String[] args) {
        /*
            Scope of a variable: Bir değişkene erişebileceğimiz aralık
                - Bu aralık değişkenin declaration'unu kaplayan en küçük süslü parantez aralığıdır
         */
        int x1;

        if (true) {
            int x2; // if bloğu bitince bu değişken ölür
        }
//        x2 = 3; // x2'nin scope'si dışında olduğu için erişim yapılamaz
        int x2 = 3; // x2 if bloğuyla birlikte öldüğü için yeniden x2 tanımlaması yapılabilir.
        while (x2 == 3) {
            int x3 = 2;
            x2 ++;
        }

        if (true) {
            int x5 = 2;
            if(true) {
                int x4 = 3;
                x5 = 9;
            }
//            x4 = 3;
            x5 = 3;
        }

    }

    public static void m1() {
        int x4; // x4 değişkeninin scope'si m1 methodudur. m1 methodu dışında erişilemez
    }

    public static void m2(int n1) { // parametrelerin scope'si yine bağlı olduğu methodun kendisidir

    }

}
