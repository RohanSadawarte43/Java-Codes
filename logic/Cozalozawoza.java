
public class Cozalozawoza {
	public static void main(String[]args){
		int i;
		for(i=1;i<=110;i++)
		{
			if(i%11==0 )
				System.out.print(" "+i+"\n");
			else if (i%3==0 && i%5==0 && i%7==0)
				System.out.print(" cozalozawoza");
			else if(i%3==0 && i%5==0)
				System.out.print(" cozaloza");
			else if(i%3==0 && i%7==0)
				System.out.print(" cozawoza");
			else if(i%7==0 && i%5==0)
				System.out.print(" lozawoza");
			else if(i%3==0 && i%5==0)
				System.out.print(" cozaloza");
			else if(i%3==0)
				System.out.print(" coza");
			else if(i%5==0)
				System.out.print(" loza");
			else if(i%7==0)
				System.out.print(" woza");
			
			else 
				System.out.print(" "+i);
		}
	}

}
