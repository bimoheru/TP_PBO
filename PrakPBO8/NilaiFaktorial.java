package PrakPBO8;

class faktorial{
    int n;

    public faktorial(int n) {
    this.n=n;
    }
    
    int hitung(){
        int hasil=1;
        for (int i = 1; i <= n; i++) {
            hasil*=i;
        }
        return hasil;
    }
    
    
    
}
public class NilaiFaktorial {
    public static void main(String[] args) {
        
       faktorial f = new faktorial(9);
        System.out.println("Faktorial dari " + f.n + " = " + f.hitung());
    }
    
}
