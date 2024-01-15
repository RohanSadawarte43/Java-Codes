
public class Exam extends StudentU5 {
	int m1, m2;

	public Exam(int roll, String name, int m1, int m2) {
		super(roll, name);
		this.m1 = m1;
		this.m2 = m2;
	}

	@Override
	public String toString() {
		return "Exam [marks 1 =" + m1 + ", marks 2 =" + m2 + ", roll=" + roll + ", name=" + name + "]";
	}

}
