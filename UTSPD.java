import java.util.Scanner;
public class UTSPD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int jumlahbarang = 0;
        double totalbelanja = 0;
        double diskon = 0;
        double grandTotal = 0;
    

        System.out.print("Masukkan jumlah barang yang ingin di beli dengan (minimal 5): ");
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine();

        if (jumlahbarang < 5) {
            System.out.println("Jumlah barang harus minimal 5!");
            return;
        }

        String[] namabarang = new String[jumlahbarang];
        double[] hargaBarang = new double[jumlahbarang];

        for (int i = 0; i < jumlahbarang; i++) {
            System.out.println("\nBarang ke-" + (i + 1));

            System.out.print("Nama Barang : ");
            namabarang[i] = scanner.nextLine();

            System.out.print("Harga Barang : ");
            hargaBarang[i] = scanner.nextDouble();
            scanner.nextLine();
        }
    

        for (int i = 0; i < jumlahbarang; i++) {
            totalbelanja += hargaBarang[i];
        }
        if (totalbelanja > 100) {
            diskon = totalbelanja * 0.10;
        } else if (totalbelanja > 50) {
            diskon = totalbelanja * 0.05;
        } else {
            diskon = 0;
        }
        grandTotal = totalbelanja - diskon;

        
        System.out.println("\n===== DAFTAR BELANJA =====");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println((i + 1) + ". " + namabarang[i] + 
                               " = " + hargaBarang[i]);
        }
        System.out.println("\nTotal Belanja : " + totalbelanja);
        System.out.println("Diskon : " + diskon);
        System.out.println("Grand Total Bayar : " + grandTotal);

        scanner.close();
    }
} 