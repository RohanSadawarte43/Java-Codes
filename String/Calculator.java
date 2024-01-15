package String;

import java.util.Scanner;


public class Calculator {
	
	public static void main(String[] args) {
		int a,b,c;
		String option;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		do{
			System.out.println("Enter your choice");
			option=sc.next();
			switch (option){
			case "add":c=a+b;
					System.out.println(c);
					break;
			case "subtract":c=a-b;
		   				System.out.println(c);
		   				break;
			case "multiply":c=a*b;
		   				System.out.println(c);
		   				break;
			case "divide":c=a/b;
		              System.out.println(c);
		              break;
			default :System.out.println("invalid option"); 
					// break;
			}
		}while(option!="end");
	}
}
