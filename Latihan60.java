/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo.lat60;

/**
Nama      : Nurul Izzah
Nim       : 22166007
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */

// Class dasar untuk karakter Akatsuki
class KarakterAkatsuki {
    String nama;
    String kekuatan;

    public KarakterAkatsuki(String nama, String kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Kekuatan: " + kekuatan);
    }
}

// Contoh kelas turunan (inheritance) dari KarakterAkatsuki
class Itachi extends KarakterAkatsuki {
    public Itachi() {
        super("Itachi Uchiha", "Sharingan");
    }
}

// Contoh kelas turunan lainnya
class Kisame extends KarakterAkatsuki {
    public Kisame() {
        super("Kisame Hoshigaki", "Samehada");
    }
}

public class Main {
    public static void main(String[] args) {
        Itachi itachi = new Itachi();
        itachi.tampilkanInfo();

        Kisame kisame = new Kisame();
        kisame.tampilkanInfo();
    }
}   
}
