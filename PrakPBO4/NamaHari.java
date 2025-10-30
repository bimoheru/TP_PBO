package PrakPBO4;

import java.util.Scanner;

public class NamaHari {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
          int pilihan;
        System.out.println("======== Nama-nama hari ========");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kmais");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("Anda ingin menampilkan hari apa: ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println("Senin");
                break;
            case 2: 
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
        }
    }
}
