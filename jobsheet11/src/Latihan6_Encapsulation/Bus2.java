//creted by 21343058_Muhammad Farel Fahlevi

package Latihan6_Encapsulation;

public class Bus2 {
    private int penumpang;
    private int maxPenumpang;

    //kosntruktor
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang (int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else{
            this.penumpang = temp;
        }
    }

    public void cetak(){
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang maks seharusnya : " + maxPenumpang);
    }
}
