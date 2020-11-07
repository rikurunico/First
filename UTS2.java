import java.util.Scanner;
public class UTS2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
                int i, nim;

                System.out.print("Masukkan 2 Digit NIM Terakhir anda = ");
                nim = userInput.nextInt();

                if (nim < 5) {nim = nim + 5;
                } for (i = 1; i <= nim; i++) {

                    if (i % 4 == 0) {System.out.print("#");
                    } else {System.out.print("*");}
                }
            }
        }
