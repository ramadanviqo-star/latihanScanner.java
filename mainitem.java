public class mainitem {
    public static void main(String[] args) {
        MenuItem menuKosong = new MenuItem();

        MenuItem menuBurger = new MenuItem("Burger Spesial rasa MBG", 25000.0);
        MenuItem menuMinuman = new MenuItem("Es teh manis", "Minuman" , 8000.0 , 50);


        menuBurger.tampilInformasi();
        menuKosong.tampilInformasi();
        menuMinuman.tampilInformasi();
    }
}