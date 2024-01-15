
public class Product {
	String name;
	int cost;
    int id;
    int qty;
    void setData(String t,int a,int b,int c )
    {
    	name=t;
    	cost=a;
    	id=b;
    	qty=c;
    }
    void display()
    {
    	
        System.out.print(name);
        System.out.print("\t\t" + cost);
        System.out.print("\t\t" + id);
        System.out.print("\t\t" + qty +"\n");
        
    }
}
