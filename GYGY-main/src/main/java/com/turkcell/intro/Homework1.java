package com.turkcell.intro;

public class Homework1 {

    public static void main(String[] args) {
        // verilen 3 sayıdan en büyük olanın ismini konsola yazan program (if-else)

        int a = 5;
        int b = 6;
        int c = 7;

        if(a > b){
            if(a > c){
                System.out.println("En büyük sayı a'dır");
            }
            else{
                System.out.println("En büyük sayı c'dir");
            }
        }
        else if(b > c){
            System.out.println("En büyük sayı b'dir");
        }
        else{
            System.out.println("En büyük sayı c'dir");
        }
    }
}
