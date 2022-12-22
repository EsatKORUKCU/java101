package Algoritmalar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // sıfır girilene kadar klavyeden girilen sayıların toplamını veren program
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int input = 0;
        do {
            System.out.print("Bir sayı giriniz: ");
            input = scanner.nextInt();
            toplam += input;
        }while(input != 0);
        System.out.println("Girilen sayıların toplamı= " + toplam);
    }
}
