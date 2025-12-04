package PrakPBO8;

class pangkat{
   int a,b;

    public pangkat(int a,int b) {
        this.a=a;
        this.b=b;
    }
   int hitung(){
       int hasil=1;
       for (int i = 1; i <= b; i++) {
           hasil*=a;
       }
       return hasil;
   }
    
}
public class Berpangkat {
    public static void main(String[] args) {
        
        pangkat p = new pangkat(2, 4);
        System.out.println("Hasil dari " + p.a + "^" + p.b + " = " + p.hitung());
    }
    
}

