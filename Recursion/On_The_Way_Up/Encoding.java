import java.util.*;

public class Encoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        decode(val, "");
        sc.close();
    }

    public static void decode(String str, String ans) {
        // Bases cases
        if (str.length() == 0) {
            System.out.println(ans);

        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            }

            int cv = (ch - '0');

            char decodedch = (char) ('a' - 1 + cv);
            System.out.println(ans + decodedch);

        } else {
            char ch = str.charAt(0);
            String roq = str.substring(1);
            if (ch == '0') {
                return;
            } else {

                int cv = (ch - '0');

                char decodedch = (char) ('a' - 1 + cv);

                decode(roq, ans + decodedch);
            }

            // 2 digit number

            String ch2d = str.substring(0, 2);
            roq = str.substring(2);

            int cv = Integer.parseInt(ch2d);

            if (cv <= 26&& cv>=10) {
                char decodedch = (char) ('a' - 1 + cv);
                decode(roq, ans + decodedch);

            }
        }

    }

}
