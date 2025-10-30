package PrakPBO4;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        String NIK, nama, sp;
        int kode_gol, jml_anak, gaji_pokok = 0;
        double tunjangan_pasangan = 0, tunjangan_anak = 0, tunjangan = 0, gaji_bersih = 0;
        
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIK  : ");
        NIK = input.nextLine();
        
        System.out.println("Golongan ");
        System.out.println("1. Menikah");
        System.out.println("2. Belum Menikah");
        System.out.println("3. Cerai");
        System.out.println("4. Menikah & punya anak");
        System.out.print("Masukkan Golongan Gaji Anda: ");
        kode_gol = input.nextInt();

        switch(kode_gol){
             case 1: 
                 gaji_pokok = 1200000;
                 break;
             case 2:
                 gaji_pokok = 1500000;
                 break;
             case 3: 
                 gaji_pokok = 1750000;
                 break;
             case 4:
                 gaji_pokok = 2000000;
                 break;
             default:
                 System.out.println("Golongan yang anda inputkan tidak terdaftar");
                 return;
        }
        
        input.nextLine();
        
        if(kode_gol == 1){
            tunjangan_pasangan = 0.10 * gaji_pokok;
            System.out.println("Tunjangan Pasangan: Rp." + tunjangan_pasangan);
            
            gaji_bersih = gaji_pokok + tunjangan_pasangan;
            System.out.println("Gaji bersihnya yaitu: Rp." + gaji_bersih);
        }
        else if(kode_gol == 3){
            System.out.print("Jumlah Anak: ");
            jml_anak = input.nextInt();
            tunjangan_anak = 0.05 * gaji_pokok * jml_anak;
            System.out.println("Tunjangan Anak: Rp." + tunjangan_anak);
            
            gaji_bersih = gaji_pokok + tunjangan_anak;
            System.out.println("Gaji bersihnya yaitu: Rp." + gaji_bersih);
        }
        else if(kode_gol == 4){
            System.out.print("Jumlah Anak: ");
            jml_anak = input.nextInt();
            
            tunjangan_pasangan = 0.10 * gaji_pokok;
            tunjangan_anak = 0.05 * gaji_pokok * jml_anak;
            System.out.println("Tunjangan Anak: Rp." +  tunjangan_anak);
            
            gaji_bersih = gaji_pokok + tunjangan_pasangan + tunjangan_anak;
            System.out.println("Gaji bersihnya yaitu: Rp." +  gaji_bersih);
        }           
        
        System.out.println("\n====== RINCIAN GAJI KARYAWAN ======");
        System.out.println("NIK                 : " + NIK);
        System.out.println("Nama                : " + nama);
        System.out.println("Golongan            : " + kode_gol);
        System.out.println("Gaji Pokok          : Rp." + (double) gaji_pokok);
        System.out.println("Tunjangan Pasangan  : Rp." + tunjangan_pasangan);
        System.out.println("Tunjangan Anak      : Rp." + tunjangan_anak);
        System.out.println("Gaji Bersih         : Rp." + gaji_bersih);   
    }
}