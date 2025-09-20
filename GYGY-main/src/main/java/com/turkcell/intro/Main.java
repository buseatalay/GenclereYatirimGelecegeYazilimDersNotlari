package com.turkcell.intro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Bu bir yorum satırıdır.

       System.out.println("Beyza Göncüler");

       //Syntax => Söz dizim kuralları.
       //Değişkenler => Programlamada verilerin bir isimle tanımladıktan sonra tutulmasıdır.

        int yas = 25; // Tamsayı numerik değerlere "integer, int" denir. (RAM yani geçici hafızaya yazdık bunu)
        yas = 30; // set
        System.out.println(yas); // get
        yas = 40;

        String isim = "Beyza Göncüler"; // Metinsel ifadeler için String kullanılır. Değişken çift tırknak("") içerisine yazılır.
        System.out.println(isim);
        isim = "Engin Demiroğ";

        float sayi = 10.14f; //sonuna f eklenir. 4 byte
        double sayi1 = 10.14; // 8 byte
        long sayi2 = 10L; // Tam sayı, sınırları büyük. 64 bit
        short sayi3 = 11; // 2 byte
        char karakter = 'a'; // Tek tırnak ('') içerisine yazılır.
        boolean aktif = true; // true ya da false olarak sadece iki değer alabilir.
        //
        // Operatörler

          System.out.println(10 + 10);
          System.out.println(11 - 10);
          System.out.println(10 * 10);
          System.out.println(10 / 10);
          System.out.println(100 % 3); // Mod alma operatörü

        //

        // Atama Operatörleri
        int a = 10;
        a = 15;
        a += 5;// a değerine 5 ekle, a değerine ata
        a -= 5; // a değerinden 5 çıkar, a değerine ata
        a *= 5; // a değerini 5 ile çarp, a değerine ata
        a /= 5; // a değerini 5'e böl, a değerine ata
        System.out.println(a);
        //

        // Karşılaştırma Operatörleri => Sonuç olarak boolean dönen operatörlerdir.
        System.out.println(a == 15); // a 15'e eşit mi? sorusunun cevabı döner
        System.out.println(a != 15); // a 15'e eşit değil mi?
        System.out.println(a > 10);
        System.out.println(a <= 15);
        System.out.println(a < 20);
        System.out.println(a <= 15);
        //

        // Mantık Operatörleri
        //yas = 17;
        System.out.println(a == 15 && yas > 18 ); // Ve => &&, iki koşulun da true olmasını bekler. Bunlardan herhangi biri sağlanmıyorsa false döner.
        System.out.println(a == 15 || yas > 18 ); // Veya => ||, iki koşuldan birinin sağlanması yeterlidir. Herhangi birinin sağlanmadığı durumda false döner.
        //

        // Yaş 18'den büyükse ekrana kişi reşit yazsın değilse değil yazsın.
        // Şart-Koşul Blokları
        if(yas >= 18){ //eğer 18'den büyükse
            System.out.println("Kişi reşit.");
        }
        else if(yas == 18){ // 18'den büyük değil ama 18'e eşitse
            System.out.println("Kişi tam 18, ay kontrolü yapılmalı");
        }
        else{
            System.out.println("Kişi reşit değil.");
        }

        boolean admin = true;
        if (admin){
            System.out.println("Logla");
        }
        //
    }
}