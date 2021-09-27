import java.util.*;

public class fb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i = 0 ; i <= s.length()-7;i++){
          int subSum = Integer.parseInt(s.substring(i, i+7));
          if(subSum==0){
              System.out.println("YES");
              return;
            }
          if(subSum==1111111){
              System.out.println("YES");
              return;
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
