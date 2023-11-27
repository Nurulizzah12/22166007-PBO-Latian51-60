/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pbo.lat58;

/**
 *
 * @author nurul
 */
/*
Nama      : Nurul Izzah
Nim       : 22166007
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/

class Bilangan {
    private final int x;
    private final int y;

    // Konstruktor dengan x = 3 & y = 4
    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

// Kelas SelisihBilangan
class SelisihBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasilJumlah = super.getX() + super.getY();
        System.out.println("Hasil Jumlah: " + hasilJumlah);
    }

    public void tampilSelisih() {
        int selisih = super.getX() - super.getY();
        System.out.println("Hasil Selisih: " + selisih);
    }
}

// Kelas JumlahBilangan
class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasilJumlah = super.getX() + super.getY();
        System.out.println("Hasil Jumlah: " + hasilJumlah);
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        SelisihBilangan selisihBilangan = new SelisihBilangan();

        jumlahBilangan.tampilHasilJumlah();
        selisihBilangan.tampilSelisih();
    }
}