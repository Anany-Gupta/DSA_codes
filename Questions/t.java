import java.util.ArrayList;

import java.util.;

public class t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();
        ArrayList<String> answer = perm(t);

    }

    public static ArrayList<String> perm(String input){
        ArrayList<String> asf = new ArrayList<>();
        int totalPc = factorial(input.length());
        
        for(int i = 0 ; i < totalPC ; i++){
            
        }
    }

    public static int factorial(int num) {
        int f = 1;
        for (int i = 2; i <= num; i++) {
            f *= i;
        }
        return f;
    }
}