import java.util.Scanner;


public class Fibonacci {
	public static void main(String[]args){
		int n,a,b,c,i;
		System.out.println("enter the number of terms");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=0;
		b=1;
		System.out.println(+a+"\n"+b);
		
		for(i=3;i<=n;i++)
		{
			 c=a+b;
			 System.out.println(+c);
			 a=b;
			 b=c;
		}
	}
}
