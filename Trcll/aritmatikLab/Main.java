package aritmatikLab;

public class Main {
    public static void main(String[] args) {
    //     int x= 10;
    //     float y = 20f;

    //     System.out.println(x + y);
    //     System.out.println(x - y);
    //     System.out.println(x / y);

    //     System.out.println(5%2); //Modüler genelde bir sayının tek mi çift mi oldugu ile ilgili kuulanılır
    
    //     int a = 10;
    //     // a = a +2;
    //     a+=2;
    //     System.out.println(a);

    //     int q = 12;
    //    // System.out.println(q++); // önce sayu sonra artılıan deger
    //     System.out.println(++q); // önce artırlmış deger sonra deger
    //     System.out.println(q);
   

        int i = 10; // 00000000 00000000 00000000 00001010
        int x = 4;  // 00000000 00000000 00000000 00000100
                    // 00000000 00000000 00000000 00000000  // and
                    // 00000000 00000000 00000000 00001110  // or 
        System.out.println(~i); //   11111111 11111111 1111111 11110101 //tillo not oparötüürü

        System.out.println(i & x); // 0 & 0 = 0  // and ve
                                    // 0 & 1 = 0
                                    // 1 & 0 = 0
                                    // 1 & 1 = 1
        System.out.println(i | x); // 0 | 0 = 0  // or veya
                                    // 0 | 1 = 0
                                    // 1 | 0 = 0
                                    // 1 | 1 = 1
        System.out.println(x >> 1);// sağa dogru bir kaydır  00000000 00000000 00000000 00000010
        System.out.println(x << 1);// sola dogru bir kaydır  00000000 00000000 00000000 00000100

    }
}
