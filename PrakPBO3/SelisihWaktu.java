package tugasPrak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SelisihWaktu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== PROGRAM MENGHITUNG SELISIH WAKTU ===");

        System.out.print("Masukkan jam pertama: ");
        int jam1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan menit pertama: ");
        int menit1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan detik pertama: ");
        int detik1 = Integer.parseInt(br.readLine());

        System.out.print("\nMasukkan jam kedua: ");
        int jam2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan menit kedua: ");
        int menit2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan detik kedua: ");
        int detik2 = Integer.parseInt(br.readLine());

        int totalDetik1 = jam1 * 3600 + menit1 * 60 + detik1;
        int totalDetik2 = jam2 * 3600 + menit2 * 60 + detik2;

        int selisih = Math.abs(totalDetik2 - totalDetik1);

        int jamSelisih = selisih / 3600;
        int sisa = selisih % 3600;
        int menitSelisih = sisa / 60;
        int detikSelisih = sisa % 60;

        System.out.println("\n=== HASIL ===");
        System.out.println("Selisih waktu: " + jamSelisih + " jam " + menitSelisih + " menit " + detikSelisih + " detik");
    }
}
