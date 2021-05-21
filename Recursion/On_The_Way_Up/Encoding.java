import java.util.*;

public class Encoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        encode(val, "");
        sc.close();
    }

    public static void encode(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            }
            int cv = ch - '0';
            char code = (char) ('a' + cv - 1);
            System.out.println(ans + code);

        } else {
            char ch = str.charAt(0);
            String roq = str.substring(1);
            if (ch == '0') {
                return;

            } else {
                int cv = ch - '0';
                char code = (char) ('a' + cv - 1);
                encode(roq, ans + code);
            }
            String ch12=str.substring(0,2);
            roq=str.substring(2);
            int ch12v=Integer.parseInt((ch12));
            if (ch12v<=26){
                char code = (char) ('a' + ch12v - 1);
                encode(roq, ans + code);
            }
        }

    }

}
