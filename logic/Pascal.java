
public class Pascal {
	int factorial(int no)
	{
		int f=1;
		for(int i=1;i<=no;i++){
			f=f*i;
		}
		return f;
	}
	void display(){
		int c,n,r,i,x=30;
		for(n=0;n<=6;n++)
		{
			for(i=1;i<=x;i++)
				System.out.print("  ");
			for(r=0;r<=n;r++)
			{
				c=factorial(n)/(factorial(n-r)*factorial(r));
				System.out.print(c+ "  ");
			}
			System.out.println();
			x--;
		}
	}
	public static void main(String[] args) {
		Pascal p1=new Pascal();
		p1.display();
	}
}
