public class Buku {
    private String idBuku;
    private String judul;
    private String pengarang;
    private boolean tersedia;

    public Buku(String idBuku, String judul, String pengarang) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tersedia = true;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void tampilkanInfo() {
        System.out.println("[" + idBuku + "] " + judul + " - " + pengarang + 
                           " | Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
    }
}

