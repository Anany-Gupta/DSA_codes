import java.util.*;

public class getKPC {
    static String keypad[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ans = KPC(str);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> KPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");

            return blist;
        }
        String subS = str.substring(1);
        ArrayList<String> prevResult = KPC(subS);//1
        ArrayList<String> myResult = new ArrayList<>();
        int num = Integer.parseInt(str.charAt(0)+"");
    
        
        for (int i=0;i<keypad[num].length();i++) {
            for (String prev : prevResult) {
                myResult.add(keypad[num].charAt(i)+ prev);
            }
        }
        return myResult;

    }

}