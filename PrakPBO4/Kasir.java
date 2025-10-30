package PrakPBO4;

import java.util.Scanner;

public class Kasir {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apakah memiliki kartu member? (y/n): ");
        char member = input.next().charAt(0);

        System.out.print("Masukkan total belanja: ");
        double belanja = input.nextDouble();
        double diskon = 0;

        if (member == 'y' || member == 'Y') {
            if (belanja > 500000) diskon = 50000;
            else if (belanja > 100000) diskon = 15000;
        } else {
            if (belanja > 100000) diskon = 10000;
        }

        double totalBayar = belanja - diskon;

        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + totalBayar);

        System.out.print("Masukkan uang bayar: ");
        double bayar = input.nextDouble();

        double kembali = bayar - totalBayar;
        System.out.println("Kembalian: Rp" + kembali);

        }
}

