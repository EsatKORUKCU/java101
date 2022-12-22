package StatikMetodlar;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);  // pi sayısını yazar

        System.out.println(Math.pow(2,3)); ; // istenen sayını karesini küpünü veren sabittir. 2 nin küpünü yazdırdı.
        System.out.println(Math.sqrt(9)); // karekökünü bulur.
        System.out.println(Math.min(6,3));// kendisine verilen degerden küçük olanı yazdırır burda üçü yazdırır.
        System.out.println(Math.max(6,3 )); // kendisine verilen degerden büyük olanı yazdırır burda altıyı yazdırır.
        
        float f = 1.6f;
        System.out.println(Math.ceil(f));// kendisne verilen degeri yukarı degerler ve tam sayı olark yazar burda 2 yazacak
        System.out.println(Math.floor(f));// kendisne verilen degeri aşağı degerler ve tam sayı olark yazar burda 1 yazacak
        System.out.println(Math.round(f)); // buçuktan aşağı ise aşağı degilde yukarı yuvarlar
        System.out.println(Math.random()*10);  // 0 ile 1 arasonda rastgele sayılar üretir. 10 ile çarparsan onu degerini de ekler
    }   
}
