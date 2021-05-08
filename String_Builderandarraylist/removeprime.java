package String_Builderandarraylist;

import java.util.*;

public class removeprime {

    public static void solution(ArrayList<Integer> al){
		// write your code here
        int n=al.size();
        for (int i=n-1;i>=0;i--){
            if(isPrime(al.get(i))){
                al.remove((i));
                
            }
        }
        System.out.println(al);
    }

    static boolean isPrime(int n) {
       

        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
        scn.close();
		solution(al);
		System.out.println(al);
	}

}