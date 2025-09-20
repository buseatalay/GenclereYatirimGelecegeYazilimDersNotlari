package com.turkcell.intro;

public class DatabaseHelper {

    public static void connect(String userName, String password){
        System.out.println("Varsayılan bilgiler ve kullanıcı bilgisi ile giriş yapılıyor");
    }


    // static -> Bulunduğu nesnenin üretilmesine gerek duymadan çalıştırılması demek
    public static void connet(String userName, String password, String url){
        System.out.println("URL bilgisindeki db'e bağlanıyor");
    }
}
