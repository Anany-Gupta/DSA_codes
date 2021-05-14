
//Increasing
import java.util.*;

public class increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inc(sc.nextInt());
        sc.close();
    }

    public static int inc(int n) {
        if (n == 0) {
            return 0;

        }
        else{
             
             inc(n-1);
             System.out.println(n);
             return 0;
        }
        
    }
    
}
