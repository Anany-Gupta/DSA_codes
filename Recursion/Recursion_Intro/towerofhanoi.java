import java.util.*;

public class towerofhanoi {
    public static void main(String[] args) {
        Scanner ssc=new Scanner(System.in);
        int n=ssc.nextInt();
        int t1id=ssc.nextInt();
        int t2id=ssc.nextInt();
        int t3id=ssc.nextInt();
        toh(n,t1id,t2id,t3id);
        ssc.close();
    }
    public static void toh(int n,int s,int d,int a) {
        if(n==0)
            System.out.println(n+"["+s+"->"+d+"]");
        toh(n-1,s,a,d);
        System.out.println(n+"["+s+"->"+d+"]");
        toh(n-1,a,d,s);

        
    }

}
