import java.util.Scanner;
public class prosedurperkalian {
     static Scanner sc = new Scanner (System.in);

     static void cetaktabel(int angka){
        for (int i = 1 ; i<= 10; i++){
            System.out.println(angka + " * " + i +  " = " + (angka*i));
        }
    
     }
     public static void main(String[] args) {
        cetaktabel(3);
     }
    
}

