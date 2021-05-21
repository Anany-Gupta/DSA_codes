import java.util.*;

public class printStairs {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getStairPaths(n, "");

        sc.close();
    }

    public static void getStairPaths(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
            return;

        } else if (n < 0) {
            return;

        }
        getStairPaths(n - 1,  ans+1 );

        getStairPaths(n - 2, ans+2);

        getStairPaths(n - 3,  ans+3);

    }
}
