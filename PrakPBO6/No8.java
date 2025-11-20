package PrakPBO6;

import java.util.Scanner;

public class No8 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            new Worker(i).start();
        }

        input.close();
    }

    static class Worker extends Thread {
        private int id;

        Worker(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("Thread ke-" + id + " berjalan");
        }
    }
}