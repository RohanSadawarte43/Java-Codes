import java.util.Scanner;


public class ArrayHighest {
	void highest()
   {
		int t,h=0;
		Scanner sc=new Scanner(System.in);	    
	    System.out.println("Enter the number of elements");
        int  l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements");
        for (int i=0;i<l;i++)
        {
        	a[i]=sc.nextInt();
        }
        t=a[0];
        for(int i=0;i<l;i++)
        {
        	if (t>a[i])
        		h=t;
           	else
        		t=a[i];
        }
        
        System.out.println("Highest=" +h);
   }
	public static void main (String[]args){
		ArrayHighest h1=new ArrayHighest();
		h1.highest();
	}
}
