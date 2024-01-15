import java.util.Scanner;


public class Sorting {
	public static void main(String[]args)
	{
		 int t,temp = 0;
			Scanner sc=new Scanner(System.in);	    
		    System.out.println("Enter the number of elements");
	        int  l=sc.nextInt();
	        int a[]=new int[l];
	        System.out.println("Enter the elements");
	        for (int i=0;i<l;i++)
	        {
	        	a[i]=sc.nextInt();
	        }
	        for(t=0;t<l;t++)
	        {
	        	for(int i=0;i<l;i++)
	        	{
	        		if (a[t]>a[i])
	        			temp=a[i];
	   	        		a[t]=temp;
	        	}
	        	
	        }
	        for(t=0;t<l;t++)
	        {
	        	System.out.print(a[t]+" ");
	        }
	      
	}
	
}

