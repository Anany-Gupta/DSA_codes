import java.util.*;

public class linearpower{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(lp(x,n));
        sc.close();

    }
    public static int lp(int x,int n) {
        if (n==0)
            return 1;
        else
            return x*(lp(x,n-1));
        
    }
}