//creted by 21343058_Muhammad Farel Fahlevi

package Latihan1_Inheritance;

public class Kedua extends Pertama {
    private int b = 8;

    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}