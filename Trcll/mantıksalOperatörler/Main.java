package mantıksalOperatörler;

public class Main {

    public static boolean test() {
        System.out.println("Test çalıştırıldı");
        return false;
    }

    public static void main(String[] args) {
        boolean b = true;

        System.out.println(b);

        System.out.println(!b);
        System.out.println(b & true);

        // false & false = false
        // false & true = false
        // true & false = false
        // true & true = true

         // false | false = false
        // false | true = true
        // true | false = true
        // true | true = true

            System.out.println(b | false);
           // System.out.println(b && false); // b degeri true oldugunda ancak sag tarafdaki degere bakar eger b degeri false ise false çalıştır.
           System.out.println(b && test()); // short sörkıt and oparatörü sag taraf true oldugu için && sagındaki yani test kısmı çalıştırıldı b nin degeri false olsa idi test hiç çalıştırılmayacak ve false yazdırcak
           System.out.println(b || test()); // short sörkıt or operatörü b nin ilk degeri false olunca sag taraf daki false çalıştıtldı eger b true olunca  sag taraf işletilmeden b true şeklinde olacak

    }
}
