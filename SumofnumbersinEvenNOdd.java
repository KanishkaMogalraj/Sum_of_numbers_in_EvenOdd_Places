import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        if(n>=0 && n<=100000000)
        {
            while(n>0)
            {
         int   l=n%10;
            n=n/10;
            if(l%2==0)
            {
                e=e+l;
            }
            else
            {
                o=o+l;
            }
            
                
            }
            System.out.print(e+"\t");
                 System.out.print(o);
        }
        
	}
}
