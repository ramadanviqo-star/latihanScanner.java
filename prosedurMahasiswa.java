import java.util.Scanner;
public class prosedurMahasiswa {
    static Scanner sc = new Scanner (System.in);

    static void mahasiswa (String nama, String nim, double ipk){
        System.out.println();
        System.out.println("Nama :" + nama);
        System.out.println("Nim:"+ nim);
        System.out.println("Ipk :" + ipk);
    }
    public static void main(String[] args) {

        mahasiswa("qwerty","123456789",4.0);
        mahasiswa("asdfg","987654321",1.0);
    }
}
