import java.util.*;

public class practicequestions1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        //1st is prime??
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int m=sc.nextInt();
            System.out.println(isprime(m));
        }
        /*
        //2nd All prime b/w h,l
        int low =sc.nextInt();
        int high =sc.nextInt();
        for (int i=low;i<=high;i++)
            System.out.println("The number "+i+isprime(i));
        */
        /*
        //3rd Fibonacii Series
        int n=sc.nextInt();
        for (int i=0;i<=n;i++)
            System.out.println(fib(i));
        
        */
        /*
        //4thDigits in number
        int num=sc.nextInt();
        System.out.println(countdig(num));
        */
        /*
        //5thPrint Digits
        int number=sc.nextInt();
        String cnum=Integer.toString(number);
        char[] str=cnum.toCharArray();
        char s[]=new char[str.length];
        for (char c:str)   
            System.out.println(c);

        */  
        /*
        //6th reverse of a number 
        int n=sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int num =n;
        int i,dig,sum;
        sum=0;
        dig=1;
        
        while (num!=0){
            i=num%10;
            sum+=((int)Math.pow(10,i-1))*dig;
            dig++;
            num=num/10;
        }
        System.out.println(sum);
        
        //7th Number Rotation
        int rnum=sc.nextInt();
        int k=sc.nextInt();
        int count=1;
        int r=rnum;
        int c = 0;
        while(r!=0)
        {c+=1;r/=10;}
        while (count<=k){
            
            int j=rnum%10;
            rnum/=10;
            
            rnum+=((int)Math.pow(10,c-1))*j;
            
            count+=1;    
        }
        System.out.println(rnum);
        */
        //8th GCD and LCM
        int g=gcd(24,36);
        System.out.println(g+"is GCD of x,y");
        System.out.println((24*36/g)+"is LCM of x,y");
        sc.close();   
                
    }
    
    static String isprime(int m){
        
        int flag=0;
               
        for (int i=2;i<m;i++){
            if (m%i==0){
                flag=1;
                break;
            }
        }
        if (flag==0)
            return ("Is Prime");
        else
            return ("Is not Prime");     
    }
    static int fib(int num){
        if (num<=1)
            return(num);
        else
            return(fib(num-1)+fib(num-2));
        
    }
    static int countdig(int n){
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        return (count);
    }
    static int gcd(int n1, int n2){
        int m1=Math.max(n1,n2);
        int m2=Math.min(n1,n2);
        int rem=m1;
        while (m1%m2!=0){
            rem=m1%m2;
            m1=m2;
            m2=rem;
            
        }
        
        return m2;
    
    }
        
    
}
