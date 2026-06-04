import java.util.Scanner;
public class praktikumprosedur {
    static Scanner sc = new Scanner (System.in);

    static void cetakGaris (){
        
        for (int i = 0; i < 30; i++){
            System.out.print("=" );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        cetakGaris();
        cetakGaris();
        cetakGaris();
    
    }
}
