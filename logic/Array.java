import java.util.Scanner;


public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,s = 0;
	    
	 
	    int a[]=new int[5];
		int i;
		System.out.println("Enter array elements");
		for(i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<5;i++){
			for(l=0;l<5;l++){
				if(i!=l){
			      if(a[i] < a[l])
			      {
			      s = a[i];
			      }
			     else continue;
			    }
		     	else continue;
		}
		}
			System.out.println("smallest no=" + s );
	}
}

