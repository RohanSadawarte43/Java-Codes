package oops;

class Test {
	public static void main(String[] args) {
		ParentPolymorphism p1 = new ParentPolymorphism();
		ChildPolymorphism c1 = new ChildPolymorphism();

		c1.show();
		p1.show();
	}
}
