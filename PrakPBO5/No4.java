package PrakPBO5;

import java.util.Scanner;

public class No4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka: ");
        int n = input.nextInt();
        
        int total = 0;
        
        for (int i = 1; i <= n * 2; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
                total += i;
            }
        }
        System.out.println("\nTotal : " + total);
    }
}
