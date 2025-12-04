//SOAL NO 5

package PrakPBO7;

public class Rekursif {
    
    
//    Method 
    void mulaiBintang(int n){
        System.out.println("Cetak bintang sebanyak " + n);
        cetakBintang(n);
    }
//    Method rekursif
    void cetakBintang(int n) {
        if(n == 0) return;
        System.out.println("*");
        cetakBintang(n-1); // rekursif
    }
}
