package com.turkcell.intro;

public class Loops {
    public static void main(String[] args) {
        // İterasyon

        // Programlamada liste eleman sayısı 0'dan başlanarak sayılır
        int[] numbers = {10, 20, 30, 40}; // array-dizi
        System.out.println(numbers[1] *5);

        // i++; i+=1;
        for(int i=5; i<10; i++){ // değişken, şart, aksiyon(her iterasyon sonrası aksiyon alır)
            System.out.println(i);
            System.out.println("Merhaba");
        }
        //
        for(int i=0; i<numbers.length; i++){ // Aşağıdaki blok ile aynı işlev
            System.out.println(numbers[i] *5);
        }
        for(int number: numbers){ //iterasyonda bütün elemanları gez ve bu elemanlara number takma adını ver. for each ile aynı
            System.out.println(number * 5);
        }

        //while => koşulu kontrol eder çalışmaya başlar
        int a = 0;
        while(a<5){ //bazı şartlarda programın sürekli çalışmaya devam etmesi için sonsuz döngüye sokulur
            a++;
            System.out.println("While çalıştı..");
        }

        //do-while => çalışmaya başlar ondan sonra koşulu kontrol eder

        int i=0;

        do{
            System.out.println("Do while çalıştı");
            i++;
        }while (i>5);

        String[] ogrenciler = {"Utku", "Muzaffer", "Seçil", "Özgür"};


        for (String ogrenci: ogrenciler){

            //Muzaffer isimli öğrenci es geçisin.
            if(ogrenci.equals("Muzaffer")){
                //continue; //Bu iterasyonu burda bitir. Sonrakine geç.
                break; // Döngüyü tamamen kırar ve devam ettirmez. Döngüden bu noktada tamamen çıkar.
            }
            System.out.println("Öğrenci: " + ogrenci + " için işlem yapılıyor");
        }


    }
}
