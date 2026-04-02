import java.util.Scanner;

public class latihanScanner {
    public static void main(String[] args) {
        //2. deklarasi scanner
        Scanner scanner = new Scanner(System.in);

        //3. input (deklarasi variabel)
        //value dalam variabel harus di berikan nllai default
        String namabarang = "";
        int harga = 0, jumlahbeli = 0, total = 0;
        
        //teks input
        System.out.print("namabarang :");
        namabarang = scanner.nextLine(); // nextline untuk string
        System.out.print("harga :");
        harga = scanner.nextInt() ; //nextint untuk integer
        System.out.print("jumlah beli :");
        jumlahbeli = scanner.nextInt() ; // nexint untuk integer

System.out.println(); //untuk jarak baris baru kosong

        //4. output
        total = harga * jumlahbeli ;
        System.out.print("total :" + total );

        
        


    }
}

