import java.util.Scanner;


public class Game {
	public static void main(String[]args)
	{
		int i,t,l,m=16,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello User");
		System.out.println("Rules for the game are\n1.You have to pick minimum 1 to maximum 4 matchsticks\n2.After your turn computer will choose minimum 1 to maximum 4 matchsticks among 21 .\n3.whowever will have one matchstick left in the last looses.");
		for(i=1;i<=21;i++)
		System.out.print("|");
		for(l=1;l<=4;l++)
		{
		System.out.println("\nChoose your matchstick/s\n");
	    t=sc.nextInt();
	    if (t<=0||t>=5)
	    {
	    	l--;
	    	continue;
	    	}
	    System.out.println("Computer chooses " +(5-t)+ " matchstick" );
		for(k=1;k<=m;k++)
	    System.out.print("|");
		m=m-5;
		}
		System.out.println();
		System.out.println("Sorry, you loose");
		
	}

}
