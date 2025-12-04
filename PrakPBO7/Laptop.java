//SOAL NO 1

package PrakPBO7;

public class Laptop { //class laptop (class adalah blueprintnya)
//    Atribut
    String merk;
    String warna;
    int harga;
    
// Method
    void info(){
        System.out.println("Laptop dengan merk " + merk + " warna " + warna + " dijual dengan harga Rp." + harga);
    }
}

/*
Kelas adalah blueprint atau cetakan untuk membuat objek. 
Objek adalah instance (perwujudan) dari kelas. 
Untuk membuat objek dari kelas, kita menggunakan kata kunci new diikuti dengan 
constructor kelas.
*/

