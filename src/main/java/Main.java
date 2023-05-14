import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Kata kata = new Kata();
        System.out.println("sum: "+Kata.sumStringsWithBig("123", "456"));

        System.out.println("sum2: "+Kata.sum("7773871528725263145015272", "428333354718558366142"));

        Kata.sum("123", "456");
        Kata.sum("123", "999");
        Kata.sum("600", "14000");
        Kata.sum("1", "007");
        Kata.sum("1", "7");

    }


}
