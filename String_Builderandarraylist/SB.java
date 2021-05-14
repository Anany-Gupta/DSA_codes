
import java.util.*;

public class SB {

	public static void solution(String str){
		//write your code here
        StringBuilder s=new StringBuilder(str);
		for (int i =0;i <s.length();i++){
		    for (int j=i+1;j<=s.length();j++){
		        String subs= s.substring(i,j);
		        if (isPallindrome(subs)){
		            System.out.println(subs);
		        }
		    }
		}
	}
	public static Boolean isPallindrome(String str){
	     int i = 0, j = str.length() - 1;
 
      while (i < j) {
 
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
 
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
	}

}