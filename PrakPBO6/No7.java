package PrakPBO6;

public class No7 {
     public static void main(String[] args) {

       thread t1 = new thread();
       System.out.println("Menjalankan thread...");
       t1.start();
    }
}

class thread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread berjalan... step " + i);

            try {
                System.out.println("    ");
            } catch (Exception e) {
                System.out.println("Thread error!");
            }
        }
    }
}
