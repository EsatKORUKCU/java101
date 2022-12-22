package Algoritmalar;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) { // dogru şifre girilene kadar kullanıcıya parola sorma programı
        Scanner scanner = new Scanner(System.in);
        String parola = "";
        do {
            System.out.print("Parola : ");
            parola = scanner.nextLine();
        }while(!parola.equals("1234"));
        System.out.println("Hoşgeldiniz");
    }
}
