package PrakPBO6;

public class No2 {
     public static void main(String[] args) {
        
        String[] mobil= {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        
            System.out.println("Mobil : ");
            for (int i = 0; i < mobil.length; i++) {
             System.out.print(mobil[i]+ " ");
            }
        System.out.println("");
        
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
             mobil[i] = "Lexus";   // nilai baru
             System.out.println("\nIndeks yang diubah: " + i);
             System.out.println("Nilai baru: " + mobil[i]);
                break;
            }   
        }
        System.out.println("\nMobil : ");
        for (int i = 0; i < mobil.length; i++) {
            System.out.print(mobil[i]+ " ");
        }
        
    }
}
