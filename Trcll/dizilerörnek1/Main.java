package dizilerörnek1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /* 
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[4] = 40;

        System.out.println(numbers.length);// dizinin sayısını verirr.
        System.out.println(Arrays.toString(numbers));// diziyi içerisni döndürebiliyoruz. froeach gibi birinci yöntem
    
        System.out.println("--------------");

        for(int i = 0; i<5; i++){
            System.out.println(numbers[i]); // diziyi yazdırmanın ikinci yönetmi

        }
        */
        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Uzunlugu  :");  // dizinin kaç elemanlı olacagını isteniyor
        int length = scanner.nextInt();// girilen sayı ile dizinin kaç elemanlı sayısı leghth atanıyor
        int[] numbers = new int[length]; // dizi numbers tanımlanıyo oluşturuluyor
        for (int i = 0; i<numbers.length; i++){   // dizi kaç elemanlı ise döndürlüyo
            System.out.print((i+1) + ". Sayı :"); // diziini kaçıncı elemanı ise o yazıyo
            numbers[i] = scanner.nextInt();  // numbers dizisine girilen degerler teker teker atanıyo
        }

        System.out.println(Arrays.toString(numbers));// dizi/array içerisine atanan tüm degerler yazdırıldı.

        int total = 0;
        for (int i=0; i<numbers.length; i++){
            total = total + numbers[i];
        }
        System.out.println(total/numbers.length);
        */

        int[] numbers = {20,32,12,46,4};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 12)); // binary dizinin içindeki bir degerin imdeksini verir.burda 12 nin kaçıncı indekste oldugunu yazar
        System.out.println(Arrays.binarySearch(numbers, -5)); // olmayan bir deger sorgulatılırsa -1 degeri gösterir.

        int[] copyOf = Arrays.copyOf(numbers, 10);// diinin eleman sayısından fazla sayıda isteninse koya o zaman dizinin varsayılan degeri burda intin 0 sıfır onunla doldurularak yazdırır.
        //int[] copyOf = Arrays.copyOf(numbers, 3); // array/ dizi içindeki istenen eleman kadar kopyalama yapar.
        System.out.println(Arrays.toString(copyOf));
        int[] copyOfRange = Arrays.copyOfRange(numbers, 2, 4);// ikinci indeksten başladı dörde kadar yazdırdı.
        System.out.println(Arrays.toString(copyOfRange));
        
        // Arrays.fill(numbers, 44); //  diziye eleman atar tamamı 44 olacak mesela
        // System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // dizinin içeriğini sıralar
        System.out.println(Arrays.toString(numbers));

        // int[] numbers1 = {1,2,3};
        // System.out.println(Arrays.toString(numbers1));
        // int [] numbers2 = numbers1;
        // System.out.println(Arrays.toString(numbers2));

        // numbers1[0] =5;
        // System.out.println(Arrays.toString(numbers2));

        // String[] names = new String[3]; // üç nesneli array/dizi tanımlıyoruz
        // names[0] = "Ali";
        // names[1] = "Ahmet";
        // names[2] = "Mehmet";

        // System.out.println(Arrays.toString(names));
        
        // for(int i = names.length -1; i>=0; i-- ) {// sondan başa dogru yazarken leht 3 olacak bu sefer dizide üçüncü indekste bir şey çünkü o dan baslıyor ikiye kadar ondan dolayı dizinin/arrayın bir eksigi diye for başlattık yine sıfırıncı indeks oldugu içinde eşittir yazdık.
        //     System.out.println(names[i]);
        // }

        // int total = 0;
        // int [] numbers = {1,5,-5,9,2,8,9};

        // int [] numbers2 = new int[numbers.length];
        // for (int i = 0; i < numbers.length; i++) {
        //     numbers2[i] = numbers[i];
        // }

        // System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.toString(numbers2));

        // for (int i = 0; i < numbers.length; i++) {
        //     total = total + numbers[i];
        // }
        // System.out.println(total);
    }
}
