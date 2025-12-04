//SOAL NO 7

package PrakPBO7;

public class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    public Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    void Tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Kelas: " + kelas);
    }
    
    
    
}
