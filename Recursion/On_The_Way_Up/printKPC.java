import java.util.*;

public class printKPC {
    static String keypad[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        KPC(str,"");
        
        sc.close();
    }

    public static void KPC(String str,String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
 
        int num = Integer.parseInt(str.charAt(0)+"");
        
        
        String roq=str.substring(1);
        for ( int i=0 ;i<keypad[num].length();i++) {

            KPC(roq,ans+keypad[num].charAt(i));
        

        }

    }

}