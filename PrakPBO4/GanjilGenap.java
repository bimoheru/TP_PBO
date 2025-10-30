package PrakPBO4;

import java.util.Scanner;

public class GanjilGenap {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
         int a;
        System.out.print("Masukkan Angka: ");
        a = input.nextInt();
        
        if(a % 2 == 0){
            System.out.println("Angka " + a + " merupakan angka genap");
        }else{
            System.out.println("Angka " + a + " merupakan angka ganjil");
        }
    }
}
