import java.io.*;
import java.util.*;

public class Strinto {

	public static void solution(String str){
		// write your code here
		int n=str.length();
		int permutations=factorial(n);
                
		for (int i=0;i<permutations;i++){
	        int temp=n;
	        String MS=str;
	        String opi="";
	        int val=i;
	        while(temp!=0){
                    
	            int rem=val%temp;
	            val=val/temp;
	            opi=opi+MS.charAt(rem);
                    
                    System.out.println(temp+"  "+val +"  "+rem+"  "+opi);
	            String lp=MS.substring(0,rem);
	            String rp=MS.substring(rem+1);
	            MS=lp+rp;
	            temp--;
	            
	        }
	        System.out.println(opi);
		}
		
		
		
	}
	public static int factorial(int n){
	    int val=1;
	    for (int i=2;i<=n;i++){
	        val*=i;
	    }
	    return val;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}