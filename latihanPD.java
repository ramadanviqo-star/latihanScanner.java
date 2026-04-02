import java.util.Scanner;

public class latihanPD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama barang, harga, dan jumlah: ");

        String namabarang = scanner.nextLine();
        double hargabarang = scanner.nextDouble();
        int jumlahharga = scanner.nextInt();
        double total = hargabarang - jumlahharga;

        System.out.println("namabarang:" +namabarang);
        System.out.println("hargabarang:"+hargabarang);
        System.out.println("jumlahharga:"+jumlahharga);
        System.out.println("total:"+ total );

    }
}