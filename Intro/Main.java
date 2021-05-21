/*1st
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        //1st is prime??
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int m=sc.nextInt();
            System.out.println(isprime(m));
        }
    }
        static String isprime(int m){
        
        int flag=0;
               
        for (int i=2;i<m;i++){
            if (m%i==0){
                flag=1;
                break;
            }}
        
        if (flag==0)
            return ("prime");
        else
            return ("not prime");
        
        }
}
*/
/*2nd
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int l=sc.nextInt();
        int h=sc.nextInt();
        int q;
        for (int i=l;i<=h;i++){
            q=isprime(i);
            if (q!=0)
            System.out.println(i);
    }}
    static int isprime(int m){
        
        int flag=0;
        double q=m;       
        for (int i=2;i<=Math.sqrt(q);i++){
            if (m%i==0){
                flag=1;
                break;
            }}
        
        if (flag==0)
            return (m);
        else return 0;
        }
}
 */  
/*    3rd 
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int a=0;
     int b=1;
     for (int i=0;i<n;i++){
         System.out.println(a);
         int c=a+b;
         a=b;b=c;
     }
}}
*/
/*import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    while (n!=0){
        count++;
        n=n/10;
    }
    System.out.print(count);
   }
  }
*/
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        String cnum=Integer.toString(number);
        char[] str=cnum.toCharArray();
        char s[]=new char[str.length];
        for (char c:str)   
            System.out.println(c);
    }}
*/
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while (n!=0){
            System.out.println(n%10);
            n=n/10;
        }
    }}
*/
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int inv=0;
     int op=1;
     while (n!=0){
         int od=n%10;
         int id=op;
         int ip=od;
         
         inv+=(int)Math.pow(10, ip-1)*id;
         n=n/10;
         op++;
         
     }
     System.out.println(inv);
     
    }}

*/

/*
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
 int rnum=sc.nextInt();
        int k=sc.nextInt();
        int r=rnum;
        int c = 0;
        while(r!=0)
        {c+=1;r/=10;}
        if (k>=0){
            k=k%c;
            
            int j=rnum%(int)Math.pow(10,k);
            rnum/=(int)Math.pow(10,k);
            rnum+=((int)Math.pow(10,c-k))*j;
              
        }

        else
        {   int k1=Math.abs(k);
            k1=k1%c;
            int j=rnum%(int)Math.pow(10,c-k1);
            rnum/=(int)Math.pow(10,c-k1);
            rnum+=((int)Math.pow(10,k1))*j;
            
        }
        System.out.println(rnum);
    }
}
*/
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     int m1=Math.max(n1, n2);
     int m2=Math.min(n1, n2);
     int rem=m1;
     while(rem!=0){
         rem=m1%m2;
         m1=m2;
         m2=rem;
     }
     System.out.println(m1);
     System.out.println(n1*n2/m1);
    
    }
    
    
}
*/
/*
import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int[] arr;
        arr = new int[]{a,b,c};
        Arrays.sort(arr);
        
        if (Math.pow(arr[2],2)==Math.pow(arr[1],2)+Math.pow(arr[0],2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
 
        if (n > 2)
            System.out.print(n);
    }
        
 }
*/
/*import java.util.*;
public class patterns{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int d=0;
        while (num!=0)
        { d++;
          num=num/10;
        }
        int pow=(int)Math.pow(10,d-1);
        while (n>0){
            int ld=n/pow;
            n=n%pow;
            System.out.println(ld);
            pow=pow/10;
            d--;
        }
        while (d>0){
            System.out.println("0");
            d--;
        }
            
    
    }
}
*/
    

import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr= new int[n];
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();}
        int max=arr[0];
        for (int x : arr){
            if (x>max)
                max=x;
        }
        for (int f=max;f>=1;f--){
            for (int i=0;i<n;i++){
                if (arr[i]>=f){
                    System.out.print("*\t");
                    
                }
                else
                    System.out.print("\t");
            }System.out.println("");
        }
    
sc.close();

}}