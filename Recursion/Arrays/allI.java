import java.io.*;

public class allI {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndx(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndx(int[] a, int x, int idx, int fsf) {
        // write ur code here
        
        if (idx==a.length){
            int res[]=new int[fsf];
            
            return (res);
        }
        if (a[idx]==x){
            int res[]=allIndx(a,x,idx+1,fsf+1);
         
            res [fsf]=idx;

            return res;
        }
        else{
            int res[] =allIndx(a,x,idx+1,fsf);
            return res;
        }
    }

}