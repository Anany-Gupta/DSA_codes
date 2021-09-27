import java.util.Scanner;

public class BeautifulMartrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[][] = new int[5][5];
        int a=0;
        int b=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j]=sc.nextInt();
                if(m[i][j]==1){
                    a=i;b=j;
                }
            }
        }
        int answer = Math.abs(a-2)+Math.abs(b-2);
        System.out.println(answer);

    }
}