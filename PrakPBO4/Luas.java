package PrakPBO4;

import java.util.Scanner;

public class Luas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Pilih Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Masukkan pilihan: ");
        int pilih = input.nextInt();

        double luas = 0;

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                luas = 0.5 * alas * tinggi;
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                luas = 3.14 * r * r;
                break;
            case 4:
                System.out.print("Masukkan sisi atas: ");
                double atas = input.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double bawah = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tTrap = input.nextDouble();
                luas = 0.5 * (atas + bawah) * tTrap;
                break;
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                luas = 0.5 * d1 * d2;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                input.close();
                return;
        }

        System.out.println("Luas bangun datar = " + luas);
        
    }
} 
