import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        perm(str, "");
        sc.close();

    }

    public static void perm(String str,String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        StringBuilder a=new StringBuilder(str);
        for (int i=0;i<a.length();i++){
            StringBuilder copya=new StringBuilder(a);

            char ch=a.charAt(i);
            String shortstr=copya.deleteCharAt(i).toString();
            perm(shortstr,ans+ch);
        }
    }
}