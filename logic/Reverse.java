import java.util.Scanner;


public class Reverse{
	public static void main(String[]args){
		int l, r=0,temp,no;
		System.out.println("Enter the number to be reverse");
		Scanner Sc=new  Scanner(System.in);
		no=Sc.nextInt();
		temp=no;
		while(no>0)
		{
			l=no%10;
			r=r*10+l;
			no/=10;
		}
		System.out.println("Reversed number="+r);
		if(r==temp)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number isn't palindrome");
	}

}
