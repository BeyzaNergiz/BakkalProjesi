package GrupCalismasi;

public class PolindromeChecker {

    public static void main(String[] args) {

        /*
    Bir dizenin palindrom olup olmadığını belirlemek için:

    Dizeyi tek tip bir harfe dönüştürün (tümü küçük harf veya tamamı büyük harf).
    Dizeyi ters çevirin.
    Orijinal dizeyi ters çevrilmiş dizeyle karşılaştırın. Eğer ikisi de aynıysa, bu bir palindromdur!
         */

        String str = "Radar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Step 1: Verilen String'i lowercase yapalim.
        String temizlenmis = str.toLowerCase();

        // Step 2: Verilen String'i tersine cevirelim.
        String tersStr = new StringBuilder(temizlenmis).reverse().toString();

        // Step 3: Verilen String'i ve Tersine cevirdigimizi birbirine esit mi kontrol edelim.
        return temizlenmis.equals(tersStr);
    }
}
