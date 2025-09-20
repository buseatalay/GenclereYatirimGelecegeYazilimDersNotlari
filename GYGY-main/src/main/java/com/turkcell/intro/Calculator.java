package com.turkcell.intro;

public class Calculator {

    // Eğer methodları ayırt edebilecek imzaları olursa nerdeyse aynısı yazılabilir
    // Buna da "Method Overloading" denir
    // Farklı yöntemler, alternatifler olması amacıyla kullanılır.
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    // Compile time

}
