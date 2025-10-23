package tugasPrak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner_BufferReader {
    public static void main(String[] args) {
        

//        SCANNER

        System.out.println("========== PENJELASAN SCANNER =========");
        System.out.println("Input Scanner lebih mudah digunakan, atau cocok untuk program interaktif.");
        System.out.println("1. Scanner menggunakan paket java.util.Scanner.");
        System.out.println("2. Mudah digunakan untuk input primitif (int, double, String).");
        System.out.println("3. Parsing dilakukan secara otomatis oleh Scanner,");
        System.out.println("   artinya data teks langsung diubah ke tipe data yang sesuai (contoh: nextInt(), nextDouble()).");
        System.out.println("4. Scanner bekerja di level tinggi, menyediakan fitur tambahan");
        System.out.println("   yang memudahkan programmer untuk membaca berbagai jenis input.");
        System.out.println("5. Contoh pembuatan objek: Scanner sc = new Scanner(System.in);");
        System.out.println();
        

        // IMPLEMENTASI SCANNER
        System.out.println("=== CONTOH PROGRAM DENGAN SCANNER ===");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan usia (INT): ");
 
        int usia = sc.nextInt(); 
        sc.nextLine();  
        
        System.out.print("Masukkan kota (STRING): ");

        String kota = sc.nextLine();
        
        System.out.println("-> HASIL SCANNER: Usia Anda " + usia + " dan tinggal di " + kota + ".");
        System.out.println();
        

        // PENJELASAN BUFFEREDREADER
        System.out.println("========== PENJELASAN BUFFEREDREADER =========");
        System.out.println("Input bufferReader lebih cepat dan efisien, cocok untuk data besar atau file.");
        System.out.println("1. BufferedReader menggunakan paket java.io.BufferedReader dan java.io.InputStreamReader.");
        System.out.println("2. Hanya bisa membaca input dalam bentuk String (teks mentah).");
        System.out.println("3. Jika ingin mengubah ke tipe data lain (seperti int atau double), harus dilakukan parsing manual,");
        System.out.println("   misalnya: int x = Integer.parseInt(br.readLine());");
        System.out.println("4. BufferedReader bekerja di level rendah, sehingga lebih cepat, cocok untuk membaca data besar.");
        System.out.println("5. Harus menangani IOException saat digunakan.");
        System.out.println("6. Contoh pembuatan objek:");
        System.out.println("   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));");
        System.out.println();


        // IMPLEMENTASI BUFFEREDREADER=
        System.out.println("=== CONTOH PROGRAM DENGAN BUFFEREDREADER ===");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Masukkan berat badan (DOUBLE): ");

            String inputBerat = br.readLine(); 

            double beratBadan = Double.parseDouble(inputBerat);
            
            System.out.print("Masukkan hobi (STRING): ");

            String hobi = br.readLine();
            
            System.out.println("-> HASIL BUFFEREDREADER: Berat badan " + beratBadan + " kg dan hobi " + hobi + ".");
            
        } catch (IOException e) {
            System.err.println("Error I/O terjadi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error konversi: Pastikan input Berat Badan adalah angka.");
        } finally {
             // Tutup Scanner, BufferedReader dapat ditutup jika diperlukan
             sc.close();
        }
        System.out.println("=========================================");
    }
}
