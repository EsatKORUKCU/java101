package kosulOparaörü;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınız    : ");
        int age = scanner.nextInt();
        System.out.println(age >=18 ? "Ehliyet Alabilirsiniz" : "Ehliyet Alamazsınız");  // if kullanımı eger age on sekizden büyükse ? sagındaki yazılır eger degilse : yanınıdaki deger yazılır.
    }
}

// ternary if if dir.
