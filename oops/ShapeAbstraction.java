package oops;

public abstract class ShapeAbstraction {
	public String color;

	abstract double area();

	public abstract String toString();

	public ShapeAbstraction(String color) {
		System.out.println("Shape wala called");
		this.color = color;
	}
}
