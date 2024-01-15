import java.util.Scanner;


public class Amstrong {
	public static void main (String[]args){
		int n,l,m,temp;
		
		System.out.println("enter your 3 digit number");
		Scanner sc=new Scanner(System.in);
	
		n=sc.nextInt();
		temp=n;
		l=n%10;
		n/=10;
		m=n%10;
		n/=10;
		if(l*l*l+m*m*m+n*n*n==temp)
			System.out.println("its an anstrong number");	
		else
			System.out.println("its not an anstrong number");
		}

}
