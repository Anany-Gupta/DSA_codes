
//Incdec
import java.util.*;

public class incdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("");

        id(n);
        sc.close();
    }

    public static int id(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            id(n - 1);
            System.out.println(n);
            return 0;
        }

    }
}
