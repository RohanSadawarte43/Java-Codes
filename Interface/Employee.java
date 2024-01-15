package Interface;

public class Employee implements Printable {
		int id;
		float salary;
		String name;
		Date bd;
		Employee(String n,int i,float s,Date d)
			{
			name=n;
			id=i;
			salary=s;
			bd=d;
			}
	public void show(){
		System.out.println("Name:"+name+"\tid:"+id+"\tSalary:"+salary+"DOB"+bd);
	}
}
