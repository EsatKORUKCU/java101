package Enumerations;

import java.time.DayOfWeek;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Aylar ay = Aylar.OCAK;  // aylar enumarations dan gelen ocak degeri ay degişkenine atanır
        System.out.println(ay); // ay degişkenine atanan ocak degeri yazdırılır.
   
        ay = Aylar.EKIM;
        System.out.println(ay);
   
        Aylar[] values = Aylar.values();// valıues aylar enusunun degerlerini bir dizi olarak getirir aktarır.
        for (int i = 0; i < values.length; i++) {  // dizi içerisndeki degerler teker teker döndürmek için kullanır.
            System.out.println(values[i]);  // dizini her bir elemanı bastırır.
        }
   
        Aylar valuOf = Aylar.valueOf("SUBAT");  // dizi içindeki subat indesini valuof degişkenine atar valuof
        System.out.println(valuOf);

        DayOfWeek sunday = DayOfWeek.SUNDAY; // java ile gelen hazır enum dayofweek
        System.out.println(sunday);

        DayOfWeek of =DayOfWeek.of(3);  // dayof un üçüncü indeksinde ne varsa onu yalır getirir.
        System.out.println(of);

        Month february = Month.FEBRUARY; // enum hazır aylar
    }
}
