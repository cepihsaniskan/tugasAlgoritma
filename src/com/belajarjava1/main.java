package com.belajarjava1;

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    Mahasiswa(String nama, String NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

     void tampilDataMhs() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan: " + jurusan);
    }

    void belajar() {
        System.out.println("Mahasiswa " + nama + ", sedang belajar");
    }
}

public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ANjai", "2834772474", "Teknik anjai");
        mahasiswa1.tampilDataMhs(); 
        mahasiswa1.belajar();
    }
}
