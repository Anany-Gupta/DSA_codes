import java.util.*;

public class Last{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();

        }
        int x = sc.nextInt();
        System.out.println(lastidx(a, n-1, x));
        sc.close();
    }

    public static int lastidx(int[] a, int idx, int x) {
        if(idx==-1 ){
            
                return -1;
        }
        if (a[idx] == x) {
            return idx;
        } else {
            return lastidx(a, idx - 1, x);
        }

    }

}