package tugasPrak2;
import java.util.Scanner;
public class IOStream {
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
          
          String nama;
          int total_belanja;
          double diskon;
          int total;
          int bayar;
          int kembalian = 0;
          
          System.out.print("Nama: ");
          nama = input.nextLine();
          
          System.out.print("Total Belanja: ");
          total_belanja = input.nextInt();
          
         if(total_belanja >= 100000){
             diskon = total_belanja * 0.1  ;
             System.out.println("Diskon: 10%");
         }else if(total_belanja >= 50000 ){
             diskon = total_belanja * 0.05;
             System.out.println("Diskon: 5%");
         }else{
             diskon = 0;
         }
         
//         System.out.println("Diskon: " + diskon + " %");
         
         total = (int) (total_belanja - diskon);
         System.out.println("Total: Rp " + total);
         
         System.out.print("Bayar: ");
         bayar = input.nextInt();
         
         if(bayar >= total){
             kembalian = bayar - total;
         }else if(bayar <= total ){
             System.out.println("Total bayar anda kurang dari harga total");
         }
         
         System.out.println("Kembalian: " + kembalian);

    }
}
