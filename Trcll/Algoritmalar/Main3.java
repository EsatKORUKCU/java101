package Algoritmalar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        //System.out.println(random.nextInt(100));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı üretilecek : ");
        int sayi = scanner.nextInt();
        int[] sayilar = new int[sayi];

        for (int i = 0; i< sayilar.length; i++){
            sayilar[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(sayilar));   
        
        float toplam = 0.0f;
        for (int i = 0; i < sayilar.length; i++){
            toplam += sayilar[i];
        }
        System.out.print("Ortalama :");
        float ortalama = toplam / sayi;
        System.out.print(ortalama);
    }
}
