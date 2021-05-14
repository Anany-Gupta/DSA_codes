//Decringing
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dec(sc.nextInt());
        sc.close();
    }

    public static int dec(int n) {
        if (n == 0) {
            return 0;

        }
        else{
             System.out.println(n);
             return (dec(n-1));
        }
        
    }
}
