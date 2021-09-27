import java.util.Scanner;

public class Solutions1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        recursiveCode(n);
        scn.close();
    }

    public static void recursiveCode(int n) {
        if (n == 0)
            return;
        recursiveCode(n - 1);
        System.out.print(n + " ");
        recursiveCode(n - 1);
        // code here

    }
}
