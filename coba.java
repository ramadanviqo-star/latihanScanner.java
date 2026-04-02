import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 

    System.out.println("Masukkan nama barang, harga, dan jumlah: ");

String namabarang = scanner.nextLine();
double harga = scanner.nextDouble();
int jumlah = scanner.nextInt();
double total = harga / jumlah ;

System.out.println("namabarang" +namabarang);
System.out.println("harga" +harga);
System.out.println("jumlah" +jumlah);
System.out.println("hasil" +total); 

    }
}