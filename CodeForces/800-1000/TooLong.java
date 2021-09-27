import java.util.Scanner;

public class TooLong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String s = sc.next();
            int l =s.length();
            if(l>10){
                System.out.println(s.charAt(0)+""+(l-2)+s.charAt(s.length()-1));
            }else{
                System.out.println(s);

            }
        }
        sc.close();
    }

    
}
