package oops;

public class ChildInheritance extends ParentInheritance {
	public void print() {
		super.print();
		System.out.println("Child");
	}

	public static void main(String[] args) {
		ChildInheritance c1 = new ChildInheritance();
		c1.print();
	}
}
