import java.util.Scanner;


public class Calculator {
	public static void main(String[]args){
		int b,a,c;
		do {
		System.out.println("Enter the numbers");
		Scanner sc= new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Enter your choise 'c' as\n1:addition:\n2:subtraction:\n3:multiplication\n4:division");
		c=sc.nextInt();
	
		switch (c)
		{
		case 1 : {
			System.out.println("addition:"+(a+b));
			break;
		}
		case 2 :{
			System.out.println("subtraction:"+(a-b));
			break;
		}
		case 3 :{
				System.out.println("multiplication:"+(a*b));
				break;
			}
		case 4 :{
			System.out.println("division:"+(a/b));
			break;
		}
		case 5:System.out.println("exit");
		}
		}
		while (c!=5);
		
		
	}

}
