package tugasPrak2;

import java.util.Scanner;

public class Gajikaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String NIK;
        String nama;
        String alamat;
        String jabatan;
        int gaji_pokok;
        int tunjangan_jabatan;
        int tunjangan_istri;
        int tunjangan_anak;
        int total_gaji;
        double pajak_penghasilan;
        double gaji_bersih;
        
        System.out.print("Nomor Induk Karyawan: ");
        NIK = input.nextLine();
        
        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();
        
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        
        System.out.print("Jabatan: ");
        jabatan = input.nextLine();
        
        System.out.print("Gaji Pokok: ");
        gaji_pokok = input.nextInt();
        
        System.out.print("Tunjangan Jabatan: ");
        tunjangan_jabatan = input.nextInt();
        
        System.out.print("Tunjangan Istri: ");
        tunjangan_istri = input.nextInt();
        
        System.out.print("Tunjangan Anak: ");
        tunjangan_anak = input.nextInt();
        
        total_gaji = gaji_pokok + tunjangan_jabatan + tunjangan_istri + tunjangan_anak;
        System.out.println("Total Gaji: " + total_gaji);
        
        pajak_penghasilan= 0.1*(gaji_pokok + tunjangan_jabatan + tunjangan_anak);
        System.out.println("Pajak Penghasilan: " + pajak_penghasilan);
        
        gaji_bersih = total_gaji - pajak_penghasilan;
        System.out.println("Gaji Bersih: " + gaji_bersih);
        
        
        
    }
}