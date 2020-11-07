package astronot;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
    Scanner dahlah = new Scanner(System.in);
    System.out.print("Masukkan Nilai N = ");
    int K, A, M, U; // >//<
    U = dahlah.nextInt();
    for(K = 1; K <= U ; K++){
    for(A = U; A>=K; A--){
    System.out.print(" ");}
    for(M = 1; M<=K; M++){      
    System.out.print(M);}
    System.out.println();}
    }
} 