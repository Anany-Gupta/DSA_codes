
import java.util.*;

public class subs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> list=gss(str);
        System.out.println(list);
        sc.close();
    }
    public static ArrayList<String> gss(String str){
        
        
        if (str.length()==0){
            ArrayList<String>blist= new ArrayList<>();
            blist.add("");
            return blist;

        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        ArrayList<String> prevSeq=gss(roq);
        ArrayList<String> mySeq=new ArrayList<>();

        for (String s :prevSeq)
            mySeq.add(s);
        for (String s :prevSeq)
            mySeq.add(ch+s);
        return mySeq;

    }
}