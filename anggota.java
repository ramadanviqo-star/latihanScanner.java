import java.util.ArrayList;
import java.util.List;

public class anggota {
    private String idAnggota;
    private String nama;
    private List<Buku> daftarPinjaman; // Mengenal kelas 'Buku' secara otomatis

    public anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.daftarPinjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void pinjamBuku(Buku buku) {
        System.out.println("\n--> " + nama + " mencoba meminjam buku: " + buku.getJudul());
        if (buku.isTersedia()) {
            buku.setTersedia(false);
            daftarPinjaman.add(buku);
            System.out.println("BERHASIL: Buku \"" + buku.getJudul() + "\" berhasil dipinjam oleh " + nama + ".");
        } else {
            System.out.println("GAGAL: Buku \"" + buku.getJudul() + "\" saat ini tidak tersedia.");
        }
    }

    public void tampilkanDaftarPinjaman() {
        System.out.println("\nDaftar Buku Dipinjam oleh " + nama + ":");
        if (daftarPinjaman.isEmpty()) {
            System.out.println("- Belum meminjam buku.");
        } else {
            for (Buku b : daftarPinjaman) {
                System.out.println("- " + b.getJudul());
            }
        }
    }
}


