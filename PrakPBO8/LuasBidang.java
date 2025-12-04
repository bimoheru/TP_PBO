package PrakPBO8;

class Persegi {
    int p, l;

    Persegi(int p, int l) {
        this.p = p;
        this.l = l;
    }

    int luas() {
        return p * l;
    }
}

class HitungHitam {
    int hitung(Persegi besar, Persegi kecil) {
        return besar.luas() - kecil.luas();
    }
}

public class LuasBidang {
    public static void main(String[] args) {
        
        Persegi besar = new Persegi(10, 5);
        Persegi kecil = new Persegi(8, 4);

        HitungHitam h = new HitungHitam();
        System.out.println("Luas Hitam = " + h.hitung(besar, kecil));
    }
    
}
