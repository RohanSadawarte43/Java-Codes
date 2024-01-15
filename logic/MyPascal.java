import java.util.Scanner;

public class MyPascal {
	
	
	
	static int factorial(int t)
	{
    int f=1,i;
	for(i=1;i<=t;i++)
	f=f*i;
	return f;
	}
	public static void main(String[]args)
	{
		int a,c,n,r,t=30;
		System.out.println("enter no. of lines u want");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		
			for (n=0;n<=c-1;n++)
			{
				for(int s=1;s<=t;s++)
					System.out.print(" ");
				for(r=0;r<=n;r++)
				{
					a= factorial(n)/(factorial(n-r)*factorial(r));
					System.out.print(a+" ");
				}
				t--;
				
				
				System.out.println();
				
			}
		
	}

}
