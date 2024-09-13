import java.util.Scanner;
public class TagihanListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaListrik = 1500, jumlahListrik, totalHargaListrik;

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        jumlahListrik = sc.nextInt();
        System.out.println("Apakah penggunaan listrik melebihi 500 kWh? " + (jumlahListrik>500));
        System.out.println("total tagihan listrik: " + (totalHargaListrik = jumlahListrik * hargaListrik));
    }
}