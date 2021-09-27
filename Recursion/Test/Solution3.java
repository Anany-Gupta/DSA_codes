import java.util.Scanner;

public class Solution3 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println(countWord(str,0));
    }

    public static int countWord(String s,int idx){
        if(s.length()-idx<3){
            return 0;
        }
        
        if (s.substring(idx,idx+3).equals("the")){
            return 1 + countWord(s,3+idx);
        }
        else {
            return  countWord(s,idx+1);
        }

        
    }
}