import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Team {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] t = (br.readLine()).split(" ");
            int n1 = Integer.parseInt(t[0]);
            int n2 = Integer.parseInt(t[1]);
            int n3 = Integer.parseInt(t[2]);
            if ((n1 == 1 && n2 == 1) || (n2 == 1 && n3 == 1) || (n3 == 1 && n1 == 1))
                count++;

            }
            System.out.println(count);

    }
}