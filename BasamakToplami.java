import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int basamak;

        // Negatif sayılar için pozitif yap
        sayi = Math.abs(sayi);

        while (sayi > 0) {
            basamak = sayi % 10; // Son basamağı al
            toplam += basamak;  // Toplama ekle
            sayi /= 10;         // Sayıyı bir basamak azalt
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
