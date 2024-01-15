import java.util.Scanner;


public class Binary {
   public static void main(String[]args)
   {
	    int t,s;
		Scanner sc=new Scanner(System.in);	    
	    System.out.println("Enter the number of elements");
        int  l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements");
        for (int i=0;i<l;i++)
        {
        	a[i]=sc.nextInt();
        }
        t=(l)/2;
        System.out.println("Enter your search");
        s=sc.nextInt();
        do{
        if(s==a[t]){
        	System.out.println("search is present at position\t"+t);
        	break;}
        else if(a[0]<=s && s<a[t])
        	t=t/2;
        else if(a[t]<s && s<=a[l-1])
        	t=(t+l)/2;
        else
        	System.out.println("search is not present");
        }
        while(t>=0);
   }
}
