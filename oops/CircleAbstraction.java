package oops;

public class CircleAbstraction extends ShapeAbstraction {
	private double radius;

	public CircleAbstraction(String color, double radius) {
		super(color);
		System.out.println("Circle wala called");
		this.radius = radius;
	}

	@Override
	double area() {
		return 3 * radius;
	}

	@Override
	public String toString() {
		return "Shape is of Color " + super.color + " with area" + area();
	}
}
