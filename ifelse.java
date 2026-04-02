import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //daftar member (nama.alamat,nohp)
        String namaMember = "", alamatMember = "", nohpMember = "" ;
        String jawab = "" ;
        
        //transaksi member
        String namabarang = "";
        double harga = 0.0, jumlah = 0.0, total = 0.0, diskon = 0.0, grandtotal = 0.0;

        //ditanyakan dulu mau daftar member atau tidak
        //berikan teks input
        System.out.println( "apakah mau daftar member? (iya/tidak)");
        jawab = scanner.nextLine() ;

        //cek jaawban user, iya/tidak menggunakan if
        //equals = scae sensitive (perhatikan kapital/tidak)
        // equalsignorcase (case nonsensitive)
        if (jawab.equalsIgnoreCase("iya")) {
            //true/jawab IYA
            System.out.println("nama user :");
            namaMember = scanner.nextLine ();
            System.out.println("alamat user : ");
            alamatMember = scanner.nextLine();
            System.out.println("no hp user :");
            nohpMember = scanner.nextLine();

            System.out.println("ingin lanjut berbelanja? (iya/tidak)");
            jawab = scanner.nextLine();
            if (jawab.equalsIgnoreCase("iya"));{
                System.out.print("namabarang :");
                namabarang = scanner.nextLine(); // nextline untuk string
                System.out.print("harga :");
                harga = scanner.nextDouble() ; // nextdouble untuk double 
                System.out.print("jumlah :");
                jumlah = scanner.nextDouble() ; // 

                System.out.println(); //untuk jarak baris baru kosong

                total = harga * jumlah ;
                System.out.print("total :" + total );
                //hitung diskon 
                if (total > 100000.0) {
                    diskon = total * 0.05 * 0.02;
                } else if (total > 300000.0) {
                    diskon = total * 0.1 * 0.02;
                }
            }
        }else {
            //jawaban tidak
            System.out.println("lanjut berbelanja :");

        }
    }
}