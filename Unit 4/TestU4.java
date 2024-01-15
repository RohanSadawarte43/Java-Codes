
public class TestU4 {
	public static void main(String[] args) {
		EmployeeU4 e[] = new EmployeeU4[4];
		Date d[] = new Date[4];
		d[0] = new Date(1, 2, 2001);
		d[1] = new Date(2, 2, 2002);
		d[2] = new Date(3, 3, 2003);
		d[3] = new Date(4, 4, 2004);

		e[0] = new EmployeeU4("Rohan", 10000, 100000f, d[0]);
		e[1] = new EmployeeU4("Roha", 10001, 200000f, d[1]);
		e[2] = new EmployeeU4("Roh", 10002, 300000f, d[2]);
		e[3] = new EmployeeU4("Roro", 10003, 400000f, d[3]);

		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		System.out.println(e[3]);
	}
}
