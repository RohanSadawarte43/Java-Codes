public class EmployeeU4 {
	int id;
	float salary;
	String name;
	Date bd;

	EmployeeU4(String n, int i, float s, Date bd) {
		name = n;
		id = i;
		salary = s;
		this.bd = bd;
	}

	public String toString() {
		return ("Name:" + name + "\tid:" + id + "\tSalary:" + salary + "\t\tDate of Joining:" + bd);
	}
}
