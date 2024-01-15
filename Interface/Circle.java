package Interface;

class Circle extends Shape implements Printable{
	float a;
	float r=3.2f;	
	void area(){
		a=3.14f*r*r;
	}
	public void show(){
		System.out.println("area of a rectangle="+a);
	}
	
		
}
