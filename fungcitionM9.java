import java.util.Scanner;

public class fungcitionM9 {

    static int persegipanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas ;
    }
    static int function(int n) {
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        return hasil;
    }
    static int hitung(int a, int b) {
        return a + b;
    }

    // perkalian double
    static double hitung(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int L = scanner.nextInt();
        int luas = persegipanjang (P,L);
        System.out.println(luas);
        System.out.println("===========================");

        int faktorial = function(3);
        System.out.println("Factorial = " + faktorial);
         System.out.println("============================");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hasilPenjumlahan = hitung(a,b);
        System.out.println("Hasil Penjumlahan = " + hasilPenjumlahan);
        System.out.println("============================");
    
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double hasilPerkalian = hitung(c,d);
        System.out.println("Hasil Perkalian  = " + hasilPerkalian);
        System.out.println("============================");
    }
}