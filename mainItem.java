public class mainItem {
    public static void main(String[] args) {
        MenuItem menuKosong = new MenuItem();

        MenuItem menuBurger = new MenuItem("Burger Spesial rasa MBG", 25000.0);
        MenuItem menuMinuman = new MenuItem("Es teh manis", "Minuman" , 8000.0 , 50);


        menuBurger.tampilInformasi();
        menuKosong.tampilInformasi();
        menuMinuman.tampilInformasi();

        System.out.println();
        System.out.println("##### Proses Transaksi #####");
 
        System.out.println("Pelanggan membeli 3 porsi Burger...");
        menuBurger.updateStok(-3);
 
        System.out.println("Restoran melakukan restock 20 Es Teh Manis...");
        menuMinuman.updateStok(20);
 
        System.out.println();
        System.out.println("##### Data Menu Setelah Update #####");
        menuBurger.tampilInformasi();
        menuMinuman.tampilInformasi();
    }
}
 


