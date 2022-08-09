import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kacSayi, sayi = 1, min = 1, max = 1, a;

        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        kacSayi = inp.nextInt();

        for (a = 1; a <= kacSayi; a++){
            System.out.print(a + ". Sayıyı Giriniz: ");
            sayi = inp.nextInt();

            if (a == 1)
            {max = a; min = a;}
            else if (sayi > max)
            {max = sayi;}
            else if (sayi < min)
            {min = sayi;}
            }

        System.out.println();
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
        }
    }