import java.util.Scanner;

public class praktikperulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBarang ke-" + i);

            System.out.println("Nama Barang :");
            String nama = scanner. next();

            System.out.println("Harga Barang :");
            int harga = scanner.nextInt();

            System.out.println("Jumlah Barang :");
            int jumlah = scanner.nextInt();

            total += harga * jumlah;

            // tanya apakah mau lanjut
            System.out.print("apakah mau tambah barang lagi? (iya/tidak): ");
            String jawab = scanner.next();

            if (jawab.equals("tidak")) {
                break; 
            }
        }

        System.out.println("\nTotal Belanja: " + total);
        System.out.println("TERIMA KASIH SUDAH BERBELANJA");
    }
}