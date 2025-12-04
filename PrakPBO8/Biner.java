package PrakPBO8;

class KonversiBiner{
    int a;

    public KonversiBiner(int a) {
        this.a = a;
    }
    
    String ubahkeBiner(){
        return Integer.toBinaryString(a);
    }
}
public class Biner {
    public static void main(String[] args) {
        
        KonversiBiner k1 = new KonversiBiner(5);
        System.out.println("Biner dari " + k1.a + " : " + k1.ubahkeBiner());
    }
    
}
