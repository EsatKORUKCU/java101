package StringBuffer;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// sacnner  dahil gelen scanner nesnesini üzerinde işlem yapıyoruz.
        // String userInput = scanner.nextLine();// kullanıcının dışarıdan girdiği degeri yami konsoldan geleceğini belirtiyoruz.kullsnıcı konsoldan nesneleri konsoldan girdikten sonra geriye kullanıcın girdigi degerleri döndürüyor
        // System.out.println(userInput);
        StringBuffer buffer = new StringBuffer();
        System.out.print("Adınız  :"); 
        buffer.append("Adı:");
        buffer.append(scanner.nextLine()) ;// ADI ALDI
        System.out.print("Soyadınız  :");
        buffer.append(" , soyadı:");
        buffer.append(scanner.nextLine()) ;// SOYADI ALDI

        System.out.println(buffer.toString()); //AD SOYADI BİRLEŞTİRDİ YAZDIRDI
    }
}
