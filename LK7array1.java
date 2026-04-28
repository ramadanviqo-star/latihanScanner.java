import java.util.Scanner;

public class LK7array1 {

    public static void main(String[] args) {

        String[] kategori = null;
        int[] harga = null;

        int total = 0;
        int jumlahbeli = 0;
        int pilihmenu = 0;
        int jumlahkategori = 0;
        int pilihanmenu =0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=== PEMESANAN TIKET SURABAYA ZOO ===");
            System.out.println("1. Input kategori dan harga");
            System.out.println("2. Input jumlah beli tiket");
            System.out.println("3. Lihat total bayar");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihmenu = scanner.nextInt();

            switch (pilihmenu) {

                case 1:
                    // Input kategori dan harga
                    System.out.print("Jumlah kategori: ");
                    jumlahkategori = scanner.nextInt();

                    kategori = new String[jumlahkategori];
                    harga = new int[jumlahkategori];

                    for (int i = 0; i < jumlahkategori; i++) {
                        System.out.print("Nama kategori ke-" + i + ": ");
                        kategori[i] = scanner.next();

                        System.out.print("Harga: ");
                        harga[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    // Input jumlah beli
                    if (kategori == null || jumlahkategori == 0) {
                        System.out.println("Mohon isi kategori terlebih dahulu (menu 1)!");
                        break;
                    }

                    System.out.println("=== DAFTAR KATEGORI ===");
                    for (int i = 0; i < jumlahkategori; i++) {
                        System.out.println(i + ". " + kategori[i] + " - Rp." + harga[i]);
                    }

                    System.out.print("Pilih kategori (index): ");
                    pilihanmenu = scanner.nextInt();

                    if (pilihanmenu < 0 || pilihanmenu >= jumlahkategori) {
                        System.out.println("Pilihan tidak valid!");
                        break;
                    }

                    System.out.print("Jumlah tiket: ");
                    jumlahbeli = scanner.nextInt();

                    System.out.println("Kategori dipilih: " + kategori[pilihanmenu]);
                    System.out.println("Harga: Rp." + harga[pilihanmenu]);
                    break;

                case 3:
                    // Total bayar
                    if (kategori == null || jumlahkategori == 0) {
                        System.out.println("Silakan input kategori terlebih dahulu!");
                        break;
                    }

                    total = harga[pilihanmenu] * jumlahbeli;

                    System.out.println("=== TOTAL PEMBAYARAN ===");
                    System.out.println("Kategori: " + kategori[pilihanmenu]);
                    System.out.println("Harga: Rp." + harga[pilihanmenu]);
                    System.out.println("Jumlah tiket: " + jumlahbeli);
                    System.out.println("Total bayar: Rp." + total);
                    System.out.println("=== PEMBELIAN BERHASIL ===");
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

            System.out.println();

        } while (pilihmenu != 4);

        scanner.close();
    }
}
