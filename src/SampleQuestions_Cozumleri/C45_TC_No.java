package SampleQuestions_Cozumleri;

import java.util.Scanner;

public class C45_TC_No {
    public static void main(String[] args) {

        // TC kimlik numarasının son rakamı çift olmak zorundadır. 0 rakamı ile başlayamaz.
        // ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
        // Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının
        // 9 katının toplamının birler basamağı 10. rakamı; 1, 3, 5, 7 ve 9. rakamın toplamının
        // 8 katının birler basamağı 11. rakamı vermektedir.

        String tcNo = "63951929936";
        System.out.println(kontrol(tcNo));
    }

    private static boolean kontrol(String tcNo)
    {
        int[] sayiDizi = parcala(tcNo);

        if (sayiDizi!=null)
        {
            boolean kosul1 = (sayiDizi[0]+sayiDizi[1]+sayiDizi[2]+sayiDizi[3]+sayiDizi[4]+sayiDizi[5]+sayiDizi[6]+sayiDizi[7]+sayiDizi[8]+sayiDizi[9])%10 == sayiDizi[10];
            boolean kosul2 = (((sayiDizi[0]+sayiDizi[2]+sayiDizi[4]+sayiDizi[6]+sayiDizi[8]) * 7 ) + ((sayiDizi[1]+sayiDizi[3]+sayiDizi[5]+sayiDizi[7]) * 9 ))%10 == sayiDizi[9];
            boolean kosul3 = ((sayiDizi[0]+sayiDizi[2]+sayiDizi[4]+sayiDizi[6]+sayiDizi[8]) * 8 )%10 == sayiDizi[10];

            return kosul1 && kosul2 && kosul3;
        }
        return false;
    }

    private static int[] parcala(String tcNo) { // Önce array oluşturup String TcNo'yu her bir indeksle kontrolünü sağlamak için parçalıyorum.
        int[] sayilar = new int[11];

        if(tcNo == null || tcNo.length()!=11) // TcNo 0 ile başlayamaz ve uzunluğu 11 olmalı şartını sağlatıyorum.
        {
            return null;
        }

        for (int i = 0; i < 11; i++)
        {
            sayilar[i] = Integer.parseInt(tcNo.substring(i,(i+1)));
        }
        return sayilar;
    }
}





