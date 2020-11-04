/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan31.perkenalanmahasiswa;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Perkenalan Mahasiswa menggunakan objek
 */

import Mahasiswa.Mahasiswa;

public class PBOIF210119077Latihan31PerkenalanMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10119077";
        mahasiswa1.nama = "Ridhwan Anwar Fauzan";
        mahasiswa1.perkenalkanDiri();
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110269";
        mahasiswa2.nama = "Rizki Adam Kurniawan";
        mahasiswa2.perkenalkanDiri();
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama = "Robi Tanzil Ganefi";
        mahasiswa3.perkenalkanDiri();
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = "10110270";
        mahasiswa4.nama = "Indra Tiola";
        mahasiswa4.perkenalkanDiri();        
    }
    
}
