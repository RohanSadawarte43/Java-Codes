package oops;

public class RectangleAbstraction extends ShapeAbstraction {
	private double length, breadth;

	public RectangleAbstraction(String color, double length, double breadth) {
		super(color);
		System.out.println("Reactangle wala called");
		this.length = length;
		this.breadth = breadth;
	}

	double area() {
		return length * breadth;
	}

	public String toString() {
		return "Shape is of Color " + color + " with area" + area();
	}

	public static void main(String[] args) {
		ShapeAbstraction r1 = new RectangleAbstraction("red", 9, 8);
		ShapeAbstraction c1 = new CircleAbstraction("blue", 7);

		System.out.println(r1);
		System.out.println(c1);
	}
}
