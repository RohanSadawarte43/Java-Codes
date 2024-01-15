import java.util.Scanner;


public class Harmonicseries {
	public static void main(String[]args){
		int  i,n;
		float  t=1;
		System.out.println("enter number of terms");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("1");
		for(i=2;i<=n;i++)
		{
			System.out.print(" + 1/" +i);
		}
		for(i=2;i<=n;i++)
		{
			
			t= t + (float)1/(float)i;
			
		}
		System.out.println("\nSummation = " +t);
	}

}
