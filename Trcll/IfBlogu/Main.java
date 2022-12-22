package IfBlogu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz  :");
        int number = scanner.nextInt();
        if (number < 100 && number >=1) {
            System.out.println("Girdiğiniz sayı 2 basamakı");
        }else if (number < 1000 && number >=100) {
            System.out.println("Girdiğiniz sayı 3 basamakı");
        }else if (number < 10000 && number >=1000) {
            System.out.println("Girdiğiniz sayı 3 basamakı");
        }else {
            System.out.println("Girdiginiz sayı 1 & 9999 arasında değildir");
        }
        
        
        
        /* 
        int number = 10;
        
        if(number < 100) {
            System.out.println("Sayı 100 den kucuk");
            if(number > 50) {
                System.out.println("Sayı 50 den buyuk");
            }
        }
        */
     
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz  ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Çift bir sayı girdiniz ");
        }else {
            System.out.println("Tek bir sayı girdiniz ");
        }
      */
      
        /*   int number = -10;

        // ikinci yöntem
        boolean result = number > 0;

        if(result) { // burası booaln da false gelirse çalışmaz
            System.out.println("Number pozitif bir sayıdır");
            System.out.println("2.");
        } else {
            System.out.println("Number negatif bir sayıdır");
        }
        */

        // // birinci yöntem 
        // if(number > 0){
        // System.out.println("Number pozitif bir sayıdır");
        // System.out.println("2.");
        // }



        System.out.println("Burası her zaman çalıştırılacak");

    }
}
