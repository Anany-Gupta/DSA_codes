

import java.util.*;



public class Subs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printSS(str,"");
        
        sc.close();
    }
    public static void printSS(String str,String ans)
    {
        
        
        if (str.length()==0){
            System.out.println(ans);
            return ;

        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        
        printSS(roq, ans+ch); 
        printSS(roq, ans+""); 
           
    }
}