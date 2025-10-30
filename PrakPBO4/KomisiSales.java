package PrakPBO4;

import java.util.Scanner;

public class KomisiSales {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        int uang_jasa = 0;
        double uang_komisi = 0, total_pendapatan;
        int nominal_jual_barang = 0;
        
        
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Total Penjualan: Rp.");  
        nominal_jual_barang = input.nextInt();
        
        
        if(nominal_jual_barang <= 2000000){
            uang_jasa = 100000;
            uang_komisi = nominal_jual_barang * 0.10;
        } else if (nominal_jual_barang > 2000000 && nominal_jual_barang <= 5000000){
            uang_jasa = 200000;
            uang_komisi = nominal_jual_barang * 0.15;
        } else if (nominal_jual_barang > 5000000){
            uang_jasa = 300000;
            uang_komisi = nominal_jual_barang * 0.20;
        } 
        
        total_pendapatan = uang_komisi + uang_jasa;
        
        System.out.println("======= Hasil Perhitungan Gaji =======");
        System.out.println("Nama                    : " + nama);
        System.out.println("Total Penjualan         : Rp." + nominal_jual_barang);        
        System.out.println("Uang Jasa               : Rp." + uang_jasa);
        System.out.println("Uang Komisi             : Rp." + uang_komisi);
        System.out.println("Total gaji yang diterima: Rp." + total_pendapatan);

    }
}    
