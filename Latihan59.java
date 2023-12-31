/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo.lat59;

    /*
Nama      : Nurul Izzah
Nim       : 22166007
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
 
class KarakterDetectiveConan {
    protected String nama;
    protected int umur;

    public KarakterDetectiveConan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public void peran() {
        System.out.println("Memiliki peran dalam cerita Detective Conan");
    }
}

// Karakter Konan, merupakan anak dari KarakterDetectiveConan
class Konan extends KarakterDetectiveConan {
    private final String organisasi;

    public Konan(String nama, int umur, String organisasi) {
        super(nama, umur);
        this.organisasi = organisasi;
    }

    @Override
    public void peran() {
        System.out.println("Anggota organisasi " + organisasi);
    }
}

// Karakter Shinichi Kudo, merupakan anak dari KarakterDetectiveConan
class ShinichiKudo extends KarakterDetectiveConan {
    private final String kemampuan;

    public ShinichiKudo(String nama, int umur, String kemampuan) {
        super(nama, umur);
        this.kemampuan = kemampuan;
    }

    @Override
    public void peran() {
        System.out.println("Memiliki kemampuan detektif yang luar biasa");
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Konan karakterKonan = new Konan("Konan", 19, "Organisasi Hitam");
        ShinichiKudo karakterShinichi = new ShinichiKudo("Shinichi Kudo", 17, "Kemampuan deduksi yang tinggi");

        // Polimorfisme, mengakses informasi karakter
        KarakterDetectiveConan karakter1 = karakterKonan;
        KarakterDetectiveConan karakter2 = karakterShinichi;

        karakter1.tampilInfo();
        karakter1.peran();

        karakter2.tampilInfo();
        karakter2.peran();
    }
}
}

