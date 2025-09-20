package com.turkcell.intro;

public class Methods {
    public static void main(String[] args) {
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("a");
        topla(5, 10);
        int sayi1 = toplama(5, 20);
        System.out.println(sayi1);
        int toplam = topla(10, 20, 30, 40, 50);
        System.out.println(toplam);
    }

    //public : erişim belirleyici
    // void: dönüş tipi(şu an boş)
    public static void veritabaninaBaglan(String veritabaniAdi){
        //Eğer veritabanı adı 2 haneden küçükse bağlanmaya çalışma
        if(veritabaniAdi.length() < 2)
            return; //bu fonksiyonu burda bitirir
        System.out.println(veritabaniAdi + " Veritabanı bağlantısı");


    }

    public static void topla(int a, int b){
        System.out.println(a+b);
    }

    public static int toplama(int a, int b){ //dönüş tipi olduğunda return keyword olmak zorunda
        return a+b;
    }

    public static int topla(int... a){
        int toplam = 0;
        for(int sayi: a){
            toplam += sayi;
        }
        return toplam;
    }

}
