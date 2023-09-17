package SampleQuestions_Cozumleri;

import java.util.Arrays;
import java.util.Scanner;

public class C31_32_ArrayOlusturma_TerstenYazdirma {
    public static void main(String[] args) {

        /*
        Soru 31-) Kullanıcıdan Arrayin uzunlugunu isteyin.
                  Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
                  İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Olusturulacak array'in uzunlugunu giriniz: ");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Olusturulacak array'in degerlerini giriniz: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Oluşturulan Array: " + Arrays.toString(arr));

        /*
        Soru 32-) Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
                  İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.
         */

        int[] arrReverse = new int[uzunluk];

        for (int i = 0; i < arr.length ; i++) {
            arrReverse[i] = arr[arr.length-1-i];
        }
        System.out.println("Olusturulan Array'in Tersi: " + Arrays.toString(arrReverse));

    }

}

