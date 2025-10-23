package tugasPrak2;

import java.util.Scanner;

public class hitung_gaya_sentripental {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==================================================");
        System.out.println("MENGHITUNG GAYA SENTRIPETAL");
        System.out.println("==================================================");
        
        System.out.print("Masukkan nilai massa (m) dalam kg: ");

        double massa = input.nextDouble(); 
        
        System.out.print("Masukkan nilai kecepatan (v) dalam m/s: ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan nilai jari-jari (r) dalam meter: ");
        double jariJari = input.nextDouble();
        
        if (jariJari == 0) {
            System.out.println("ERROR: Jari-jari (r) tidak boleh nol!");
        }
       
        double kecepatanKuadrat = kecepatan * kecepatan;

        double gayaSentripetal = (massa * kecepatanKuadrat) / jariJari;
        
        System.out.println("\n==================================================");
        System.out.println("HASIL PERHITUNGAN GAYA SENTRIPETAL");
        System.out.println("--------------------------------------------------");
        System.out.println("Massa (m) = " + massa + " kg");
        System.out.println("Kecepatan (v) = " + kecepatan + " m/s");
        System.out.println("Jari-jari (r) = " + jariJari + " meter");
        System.out.printf("Gaya Sentripetal (Fc) = %.2f Newton\n", gayaSentripetal);
        System.out.println("==================================================");
    }
}
