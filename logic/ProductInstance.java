
public class ProductInstance {
	public static void main (String[]args)
	{
	Product p1=new Product();
	Product p2=new Product();
	Product p3=new Product();
	Product p4=new Product();
	Product p5=new Product();
	Product p6=new Product();
	p1.setData("Mobile    " , 10000, 100011 ,100);
	p2.setData("Laptop    ",50000,101111,80);
	p3.setData("Earphones ",500,111111,400);
	p4.setData("Hedphones ",1000,111011,200);
	p5.setData("Television",60000,110011,80);
	p6.setData("Computer  ",40000,100011,70);
	System.out.print("                             PRODUCT\n\n");
	System.out.print("                             --------");
	System.out.print("Name\t\t\tCost\t\tID\t\tQuantity\n");
	System.out.println("---------------------------------------------------------------");
	p1.display(); 
	p2.display();
	p3.display();
	p4.display();
	p5.display(); 
	p6.display(); 
	}
	

}
