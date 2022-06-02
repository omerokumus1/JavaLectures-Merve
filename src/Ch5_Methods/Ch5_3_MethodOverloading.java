package Ch5_Methods;

import java.util.ArrayList;

public class Ch5_3_MethodOverloading {
    public static void main(String[] args) {
        // method overloading: aynı isme fakat farklı parametre listesine sahip methodlardır
        // parametre listesini farklı yapmak: 1- parametre sayısı farklı olabilir, 2- en az 1 tane parametrenin tipi farklı olmalı
        //          **** parametre isimleri (n1, n2, d1 vb) parametre listesini farklı yapmaz

        // neden method overloading? -> Farklı veri tipleriyle aynı işlemleri aynı method ismiyle yapabilmek için
        add(3, 5);
        add(3.0, 5.2);
        add("s ", " ssss");
        add(3.2, 4);
    }

    public static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void add(double d1, double d2) {
        System.out.println(d1 + d2);
    }

    public static void add(String s1, String s2) {
        System.out.println(s1 + s2);
    }

//    public static double add(double d1, double d2) { // return tipinin method overloading ile alakası yoktur
//        return d1 + d2;
//    }
}
