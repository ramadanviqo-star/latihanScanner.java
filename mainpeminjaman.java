public class mainpeminjaman {
    
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("B001", "Pemrograman Java Dasar", "Viqo");
        Buku buku2 = new Buku("B002", "Struktur Data dan Algoritma", "Januar");
        Buku buku3 = new Buku("B003", "Sistem Basis Data", "Clouditia");
        Buku buku4 = new Buku("B004", "Jaringan Komputer", "Siti ropeah");

        anggota anggota1 = new anggota("A001", "Rizki");
        anggota anggota2 = new anggota("A002", "Dina");

        System.out.println("==========================================");
        System.out.println("        DAFTAR BUKU PERPUSTAKAAN          ");
        System.out.println("==========================================");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
        buku4.tampilkanInfo();

        System.out.println("\n==========================================");
        System.out.println("                  PEMINJAMAN             ");
        System.out.println("==========================================");

      
        anggota1.pinjamBuku(buku1);
        anggota1.pinjamBuku(buku2);
        anggota2.pinjamBuku(buku3);
        anggota2.pinjamBuku(buku1);

        System.out.println("\n==========================================");
        System.out.println("       STATUS DAFTAR BUKU DIPINJAM        ");
        System.out.println("==========================================");
        anggota1.tampilkanDaftarPinjaman();
        anggota2.tampilkanDaftarPinjaman();
    }
}
