
public class Result extends Exam implements Sports {
	int total,sm;
	public Result(int roll, String name, int m1, int m2) {
		super(roll, name, m1, m2);

	}
	public void sportMarks() {
		sm=70;
		total = m1+m2+sm;
	}
	@Override
	public String toString() {
		return "Result [total=" + total + ", sports marks=" + sm + ", m1=" + m1 + ", m2="
				+ m2 + ", roll=" + roll + ", name=" + name + "]";
	}

}
