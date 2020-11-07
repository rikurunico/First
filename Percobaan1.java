package astronot;
import java.util.Scanner;
public class Percobaan1 {
    public static void main(String [] args){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        for (int i = 1 ; i <= N ; i--){
        System.out.print("*");}
    }
}
