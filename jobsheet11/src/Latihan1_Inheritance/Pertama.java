//creted by 21343058_Muhammad Farel Fahlevi

package Latihan1_Inheritance;

public class Pertama {
    private int a = 10;

    protected void terprotek(){
        System.out.println("Method in hanya untuk anaknya");
    }

    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
