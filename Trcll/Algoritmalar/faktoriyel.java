package Algoritmalar;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Lütfen bir sayı giriniz");
        int number = scanner.nextInt();

        // 5! = 5 * 4 * 3 * 2 * 1

        int sonuc = number;
        for (int i = number -1; i > 0; i--){
            sonuc = sonuc * i;
        }
        System.out.println(sonuc);
    }
}
