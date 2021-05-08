import java.util.*;
public class Intro{
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        System.out.println(a);
        a.remove(2);//index 2
        System.out.println(a);
        a.set(1,99);
        System.out.println(a);
        a.add(3,84);
        System.out.println(a);

    }

}