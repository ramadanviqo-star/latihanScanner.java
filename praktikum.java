import java.util.Scanner;

public class praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String namaMahasiswa="";
        int nimMahasiswa ;
        int SKS ; 
        double nilaiIPS = 0.0;

         System.out.println("masukkan data mahasiswa");

         System.out.println("namaMahasiswa :");
         namaMahasiswa = scanner.nextLine ();
         System.out.println("nimMahasiswa : ");
         nimMahasiswa = scanner.nextInt();
         System.out.println("SKS :");
         SKS = scanner.nextInt();
         System.out.println("nilaiIPS :");
         nilaiIPS = scanner.nextDouble();


         int IPS= 0;
         if (nilaiIPS >= 3.50) {
            SKS = 24 ;
         } else if (nilaiIPS >= 3.00 && nilaiIPS <= 3.49) {
            SKS = 22 ;
         } else if (nilaiIPS >= 2.00 && nilaiIPS <= 2.99) {
            SKS = 20 ;
         } else if (nilaiIPS >= 1.00 && nilaiIPS <= 1.00 ) {
            SKS = 18 ;
         } else if (nilaiIPS <= 0.99 ) {
            SKS = 0 ;
         }

         switch (SKS ) {
            case 24: System.out.println("baik sekali");
                break;
            case 22 : System.out.println("baik");
                break;
            case 20 : System.out.println("cukup baik");
                break ;
            case 18 : System.out.println("cukup");
                break;
         }

        System.out.println("namaMahasiswa:" +namaMahasiswa);
        System.out.println("nimMahasiswa:"+nimMahasiswa);
        System.out.println("SKS:"+SKS);
        System.out.println("total : " + nilaiIPS);

        scanner.close();


    }
}
