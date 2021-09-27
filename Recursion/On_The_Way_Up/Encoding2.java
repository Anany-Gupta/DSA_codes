import java.util.*;

public class Encoding2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        decode(val, "");
        sc.close();
    }

    public static void decode(String str, String ans) {
       
        // Bases cases
        if (str.length() == 0) {
            System.out.println(ans);
            return;

        }
        if(str.charAt(0)=='0'){
            return;
        }
        //Single Char
        char char1 = str.charAt(0);
        int  num1=Integer.parseInt(char1+"");
        
        decode(str.substring(1),ans+(char)('a'+num1-1));
        //2digit
        if (str.length()>1){
            
            char char2 = str.charAt(1);
            int num2=Integer.parseInt(""+char1+char2);
            if(num2>=10 && num2<=26){
                decode(str.substring(2),ans+(char)('a'+num2-1));
            }
        }
        
    }
}
