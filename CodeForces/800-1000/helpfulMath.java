import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.Scanner;

public class helpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String equation = sc.next();
        if (equation.length() == 1) {
            System.out.println(equation);
            return;
            
        }
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = 0 ; i < equation.length() ; i++){
            if(!"+-/*".contains(equation.charAt(i)+"")){
                a.add(equation.charAt(i)-'0');
                
            }
        }Collections.sort(a);
        System.out.println(a.toString());
        

    }
}