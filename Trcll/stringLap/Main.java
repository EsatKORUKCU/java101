package stringLap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* String str1 = "Hello";
        String str2 = "Hello";
       // System.out.println(str1 == str2); // str1 ve str2 iki degişkenin karşılaştırdı.Bellekte kapladıgı alan ile ilgili
        System.out.println(str1.equals(str2)); // iki nesnenin karakterlerini teker teker  ikisinin aynı olup olmadıgını karşılaştırır
        str2 = "HELLO";
        System.out.println(str1.equalsIgnoreCase(str2));  // iki nesnenin içindekileri büyüktür veye küçüktür farketmeksizin karşılaştır.
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Yazı giriniz  :  "); 
        String line = scanner.nextLine();//kullanıcıdan deger aldık
        System.out.println(line.toLowerCase()); // tüm karakterler küçük
        System.out.println(line.toUpperCase());// tüm karakterler büyük
        System.out.println(line.charAt(3)); //girilen nesnenin üçüüncü karakterini yazdırır.

        System.out.println(line.length()); // nesne kaç karakter
        System.out.println(line.substring(3));
        System.out.println(line.isEmpty()); // girdigimiz nesneni boş olup olmadıgını gösterir.
        System.out.println(line.replace("ab","wq"));// girilen herhangi bir degeri yeni deger ile değitirir.

        System.out.println(line.indexOf('a')); // nesnein içindeki a karakterini nerede oldugunu  Başta soona dogru indeksini verir.
        System.out.println(line.lastIndexOf('a'));// nesnein içindeki a karakterini nerede oldugunu  sondan başa dogru indeksini verir.
        System.out.println(line.trim()); // baştaki ve sondaki boşlukları kaldırarak yazar.
        */ 
         Scanner scanner = new Scanner(System.in);
         String str1 = scanner.nextLine(); // KULLANICIDAN DEGER ALDI
         String str2 = scanner.nextLine();// KULLANICIDAN DEGER ALDI

         System.out.println(str1 + "" + str2); // ALINAN DEGERLERİ ALIP ARAYA BİR BOŞLUK BIRAKARAK YAZDIRDI.

    }
}
