package Algoritmalar;

import java.util.Scanner;

public class ters {// klavyeden girilen sayıların karakterlerini tersten yazdıracak program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir yazı giriniz :");
        String text = scanner.nextLine();

        for (int i = text.length() -1 ; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
