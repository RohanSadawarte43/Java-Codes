public class TestShape {
	void test(AbstractShape s) {
		s.area();
	}

	static float r, l, b;

	public static void main(String[] args) {
		// AbstractShape a=new AbstractShape;
		Circle c1 = new Circle();
		RectangleU6 r1 = new RectangleU6();
		// c1.area();
		// r1.area();
		TestShape t = new TestShape();
		t.test(r1);
		// System.out.println("YOU ARE IN CLASS RECTANGLE");
		t.test(c1);
		// System.out.println("YOU ARE IN CLASS CIRCLE");
	}
}
