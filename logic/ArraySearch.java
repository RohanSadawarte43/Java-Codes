import java.util.Scanner;


public class  ArraySearch {
	public static void main(String[]args){
		int k;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter array elements");
		for (int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter your search element");	
		k=sc.nextInt();	
		for (int i=0;i<5;i++)
		{
			if(k==a[i])
			System.out.println("your search " +k +" is present in the array at position " +(1+i));	
		}
		
	
	
}
}
