package PrakPBO8;
class Nilai {
    int a, b, c;

    Nilai(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class Rata {
    double hitung(Nilai n) {
        return (n.a + n.b + n.c) / 3.0;
    }
}

public class RataRata {
    public static void main(String[] args) {
        
        Nilai n = new Nilai(80, 70, 90);
        Rata r = new Rata();

        System.out.println("Rata-rata dari " + n.a + ", " + n.b + ", "+ n.c + " = " + r.hitung(n));
    }
}

