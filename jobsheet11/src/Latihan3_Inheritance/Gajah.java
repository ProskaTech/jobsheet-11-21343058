//creted by 21343058_Muhammad Farel Fahlevi

package Latihan3_Inheritance;

public class Gajah extends Hewan {
    //meng-overwrite method pada class Hewam
    public static void testClassMethod(){
        System.out.println("the class method in hewan");
    }

    //meng-overwrite method pada class hewan
    public void testInstanceMethod(){
        System.out.println("the instance method in hewan");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
