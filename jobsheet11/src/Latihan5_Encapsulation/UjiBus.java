//creted by 21343058_Muhammad Farel Fahlevi

package Latihan5_Encapsulation;

import Latihan4_Inheritance.B;

public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busmini dari kelas bus
        Bus busMini = new Bus();


        //memasukkan nilai jumlah penumpang dan
        //penumpang maksimal ke dalam obkel busMini.
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;

        //memanggil method cetak pada kelas bus
        busMini.cetak();

        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        //memanggil method cetak pada kelas bus
        busMini.cetak();

        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
