package tugasPrak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PembelianBuah {
     public static void main(String[] args) throws IOException {    
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        
        System.out.print("Masukkan jumlah buah mangga yang dibeli: ");
        int mangga = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan jumlah tetangga: ");
        int tetangga = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan jumlah jambu per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan jumlah mangga yang busuk: ");
        int manggaBusuk = Integer.parseInt(input.readLine());
        
        int totalJambu = tetangga * jambuPerTetangga;
        int totalMangga = mangga - manggaBusuk;
        int totalBuah = totalJambu + totalMangga;
        
        System.out.println("\n=== HASIL ===");
        System.out.println("Total jambu: " + totalJambu + " pcs");
        System.out.println("Total mangga (setelah dikurangi busuk): " + totalMangga + " pcs");
        System.out.println("Total semua buah: " + totalBuah + " pcs");
    }
}
