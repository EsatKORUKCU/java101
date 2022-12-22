package iliskiselOparatörlerLab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sonuc = 9 != 9;
        System.out.println(sonuc);

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        System.out.println(str1.equals(str2)); // string ifadelerde eşitlik için == yerine equal kullanılır.

        
    }
    
}
