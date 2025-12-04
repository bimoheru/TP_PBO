package PrakPBO8;

class Kasir {
    double harga, total;
    int jumlah;
    double diskon;

    // 1. Jika hanya harga
    Kasir(double harga) {
        this.harga = harga;
        total = harga;
    }

    // 2. Jika harga dan jumlah
    Kasir(double harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        total = harga * jumlah;
    }

    // 3. Jika semua lengkap
    Kasir(double harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
        total = (harga * jumlah) - (harga * jumlah * diskon / 100);
    }

    void tampil() {
        System.out.println("Total Bayar = " + total);
    }
}

public class Kasir_Constructor {
    public static void main(String[] args) {
        
        Kasir k1 = new Kasir(10000);
        Kasir k2 = new Kasir(10000, 3);
        Kasir k3 = new Kasir(10000, 5, 10);

        k1.tampil();
        k2.tampil();
        k3.tampil();
    }
    
}
