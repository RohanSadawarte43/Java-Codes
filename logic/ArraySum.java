import java.util.Scanner;


public class ArraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		int a[]=new int[5];
		System.out.println("Enter array elements");
		for (int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("sum of a complete array is:");
		for (int i=0;i<5;i++)
		{
			t=t + a[i];
		}
		System.out.println(t);
	}
}
