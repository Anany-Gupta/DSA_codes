import java.util.*;
public class WordC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();

        String st  = (s.charAt(0)+"").toUpperCase()+s.substring(1);
        System.out.println(st);
        sc.close();
        
    }
}