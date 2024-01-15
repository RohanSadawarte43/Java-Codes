package oops;

public class Constructors extends ConstructorsInherited {
	int i = 10;

	public Constructors() {
		this(1, 2);
		System.out.println("In C1");
	}

	public Constructors(int i, int j) {
		this(1);
		System.out.println("In C2");
		System.out.println(i + j);
	}

	public Constructors(int i) {
		super();
		System.out.println("In C3");
		System.out.println(i);
	}

	public static void main(String[] args) {
		Constructors C1 = new Constructors();

		// JVM
		Class cl1 = C1.getClass();
		System.out.println(cl1);
	}
}
