package tugasPrak2;

public class Phytagoras {
    public static void main(String[] args) {
        double a = 6, b = 8, cKuadrat = (a * a) + (b * b), c = 0, i = 0;

        while (i * i <= cKuadrat) {
            c = i;
            i = i + 0.01;
        }  

        int cBulat = (int) (c + 0.5);
        int keliling = (int) (a + b + cBulat);
        
        System.out.println("Nilai sisi miring (c) = " + cBulat);
        System.out.println("Nilai keliling = "+ keliling);
        
    }
}
