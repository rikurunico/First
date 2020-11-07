package astronot;
import java.util.Random;
import java.util.Scanner;
public class Percobaan4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu='y'; do{
        int number = random.nextInt(10) + 1; 
        boolean success = false;
        do {
        System.out.print("Tebak angka (1-10): "); 
        int answer = input.nextInt(); 
        input.nextLine();
        success = (answer == number);
        if (answer>number){System.out.println("Angka tebakan > Angka yang ditebak");}
        else if(answer<number){System.out.println("Angka tebakan < Angka yang ditebak");}
        else {System.out.println("Tebakan Berhasil");}
        } while(!success);
        break;
        System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
        menu = input.findInLine(".").charAt(0); 
        input.nextLine();
        } while(menu=='y' || menu=='Y');
    }
}
