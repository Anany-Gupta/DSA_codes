import java.util.*;

public class zigziag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printZZ(n);
        sc.close();

    }
    public static int printZZ(int n) {
        if (n==0){
            return 0;
        }
        System.out.print(n+" ");
        printZZ(n-1);
        System.out.print(n+" ");
        printZZ(n-1);
        System.out.print(n+" ");
        return 0;
        

        
    }
}

