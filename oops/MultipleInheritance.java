package oops;

interface one {
	default void show() {
		System.out.println("one's show called");
	}
}

interface two {
	default void show() {
		System.out.println("two's show called");
	}
}

class MultipleInheritance implements one, two {
	public void show() {
		System.out.println("Show Called");
		one.super.show();
		two.super.show();
	}

	public static void main(String[] args) {
		MultipleInheritance m1 = new MultipleInheritance();
		m1.show();
	}
}
