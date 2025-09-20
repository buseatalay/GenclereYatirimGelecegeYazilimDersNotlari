package com.turkcell.intro;

public class Homework2 {
    public static void main(String[] args) {
        //Harf notu hesaplama programı. (note = )

        int not = 70;
        if(not >= 95){
            System.out.println("A");
        }
        else if (not<95 && not>=90){
            System.out.println("A-");
        }

        else if(not<90 && not>=85){
            System.out.println("B+");
        }

        else if(not<85 && not>=80){
            System.out.println("B");
        }

        else if(not<80 && not>=75){
            System.out.println("B-");
        }

        else if(not<75 && not>=70){
            System.out.println("C+");
        }

        else if(not<70 && not>=65){
            System.out.println("C");
        }
        else if(not<65 && not>=60){
            System.out.println("C-");
        }

        else if(not<60 && not>=55){
            System.out.println("D");
        }

        else {
            System.out.println("F");
        }

    }
}
