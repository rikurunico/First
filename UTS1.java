import java.util.Scanner;
public class UTS1 {
    public static void main(String[] args){
        Scanner isi =  new Scanner(System.in);

        int golongan, gaji2, gaji, lamakerja, tunjangan, pajak;
        System.out.print("Masukkan Golongan = ");
        golongan = isi.nextInt();

        if (golongan == 1) { gaji = 2500000;}
        else if (golongan == 2 ) { gaji = 3000000; }
        else { gaji =  4500000; }

        System.out.printf("Gaji = %d \n", gaji);
        System.out.print("Sudah Bekerja Berapa Lama = ");
        lamakerja = isi.nextInt();

        if (lamakerja < 3){ pajak = 0 ;
        } else if (lamakerja >=3 && lamakerja <=5) {pajak = 10;
        } else if (lamakerja >=6 && lamakerja <=8) {pajak = 20;
        } else {pajak = 25;}

        tunjangan =  pajak*gaji/100;
        System.out.printf("Tunjangan Anda = %d \n", tunjangan);
        gaji2 = gaji - tunjangan;
        System.out.printf("Gaji pokok anda adalah = %d\n", gaji2);
    }
}