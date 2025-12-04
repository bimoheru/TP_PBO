package PrakPBO7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
//      NO 1
         System.out.println("Soal 1");
         Laptop l1= new Laptop(); // membuat objek
         l1.merk = "Lenovo Legion"; //mengisi atribut
         l1.warna = "Hitam";
         l1.harga = 26000000;
         l1.info(); //memanggil method untuk menampilkan isi method
    
    
         System.out.println("");

      
//    NO 2
        System.out.println("Soal 2");

        PersegiPanjang PP = new PersegiPanjang();
        PP.panjang = 10;
        PP.lebar = 20;
        System.out.println("Keliling persegi panjang dengan panjang " + PP.panjang + " dan lebar " + PP.lebar + " adalah " + PP.HitungKeliling());
    
        System.out.println("");
        
//   NO 3
        System.out.println("Soal 3");
        
        Orang Org = new Orang();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        Org.tanggal = input.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        Org.bulan = input.nextInt();
        
        System.out.println(" ");
        
        System.out.println("Tanggal Lahir: " + Org.tanggal);
        System.out.println("Bulan Lahir: " + Org.bulan);
        System.out.println("Kode Tebakan: " + Org.HitungTBL());
        
        System.out.println(" ");
    
//    NO 4
    
        System.out.println("Soal 4");
        SumpahPemuda sp = new SumpahPemuda();
        System.out.println(sp.textSumpahPemuda);
        sp.textSelanjutnya();
    
        System.out.println(" ");
        
//    NO 5
        System.out.println("Soal 5");
        Rekursif r = new Rekursif();
        r.mulaiBintang(10);
    
        System.out.println(" ");
        
//    NO 6
       System.out.println("Soal 6");
       Civitas C1 = new Dosen("Gani ST.MT");
       Civitas C2 = new Mhs("Bim");
       Civitas C3 = new Staff("Dani");
      
       System.out.println(C1.nama + " adalah " + C1.status);
       System.out.println(C2.nama + " adalah " + C2.status);
       System.out.println(C3.nama + " adalah " + C3.status);
      
       System.out.println("");
      
//      NO 7
       System.out.println("Soal 7");
       input.nextLine();
        
       System.out.print("Masukkan Nama: ");
       String nama = input.nextLine();
       
       System.out.print("Masukkan NPM: ");
       String npm = input.nextLine();
        
       System.out.print("Masukkan Kelas: ");
       String kelas = input.nextLine();
        
       Mahasiswa m1 = new Mahasiswa(nama, npm, kelas);
       m1.Tampil();
        
        
        
        
    }    
}
