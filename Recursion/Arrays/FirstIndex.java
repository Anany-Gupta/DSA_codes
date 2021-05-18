import java.util.*;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();

        }
        int x = sc.nextInt();
        System.out.println(firstidx(a, 0, x));
        sc.close();
    }

    public static int firstidx(int[] a, int idx, int x) {
        if(idx==a.length ){
            
                return -1;
        }
        if (a[idx] == x) {
            return idx;
        } else {
            return firstidx(a, idx + 1, x);
        }

    }

}