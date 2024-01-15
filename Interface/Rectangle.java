package Interface;

class Rectangle extends Shape implements Printable{
	float a;
	float l=3.2f;	
	float b=4.42f;
	void area(){
		a=l*b;
	}
	public void show(){
		System.out.println("area of a rectangle="+a);
	}
	
		
}
