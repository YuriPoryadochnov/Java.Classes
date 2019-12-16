import java.util.*;
enum Numbers {ONE, TWO, THREE, FOUR, FIVE}
public class TaskClasses {
    public static void main(String[] args) {
        Numbers n1 = Numbers.ONE;
        Numbers n2 = Numbers.ONE;
        if (n1 == n2) {System.out.print ("true");}
        else {System.out.print ("false");}
        System.out.println (Numbers.FIVE.ordinal ());

    }
}
