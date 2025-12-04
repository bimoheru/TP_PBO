//SOAL NO 6

package PrakPBO7;

public class Civitas {
    String nama;
    String status;
}

class Dosen extends Civitas{
    Dosen(String nama){
        this.nama = nama;
        this.status = "Dosen";
    }
}

class Mhs extends Civitas{
    Mhs(String nama){
        this.nama = nama;
        this.status = "Mahasiswa";
    }
}
class Staff extends Civitas{
    Staff(String nama){
        this.nama = nama;
        this.status = "Staff";
    }
}

