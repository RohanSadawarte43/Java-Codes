package Interface;


public class TestInterface {
public static void main(String[] args) {
	Circle c1=new Circle();
	Rectangle r1=new Rectangle();
	Date c=new Date(1,1,2001);
	Employee e1=new Employee("rohan",1001,100000,c);
	c1.area();
	c1.show();
	r1.area();
	r1.show();
	c.show();
	e1.show();
}
}

