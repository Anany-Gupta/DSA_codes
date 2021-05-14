
//Incdec
import java.util.*;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        id(n);
        sc.close();
    }

    public static int id(int n) {
        if (n <= 0) {
            return 0;
        } 
        {
            if (n%2==0){
                n=n-1;
                id(n - 2);
                System.out.println(n);
                return 0;
            }
            else{
                id(n - 2);
                System.out.println(n);
                return 0;}
        }

    }
}
