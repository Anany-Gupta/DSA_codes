import java.util.*;
import java.io.*;

public class DominoPilling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int count = (M*N)/2;
        System.out.println(count);
        sc.close();
    }
}