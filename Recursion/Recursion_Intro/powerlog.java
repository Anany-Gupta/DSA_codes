import java.util.*;

class powerlog {
    /* Function to calculate x raised to the power y */
    public static int lp(int x, int y) {
        if (y == 0)
            return 1;
        else if (y % 2 == 0) {
            int res = lp(x, y / 2) * lp(x, y / 2);
            return res;
        } else {
           int res = lp(x, y / 2) * lp(x, y / 2);
            return res * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(lp(x, n));
        sc.close();

    }
}