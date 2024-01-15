
public class Manager extends Employee{
float pa,oa,fa,net;

	Manager(int id, String name, float salary) {
		super(id, name, salary);
		pa=salary*0.08f;
		fa=salary*0.13f;
		oa=salary*0.03f;
	}
	void grossSalary(){
		gross=salary+hra+(pa+oa+fa);
	}
	void netSalary(){
		grossSalary();
		net=gross-(pt+pf);
		System.out.println("Net:"+net);
	}
	public String toString(){
		return ("Name:"+name+"\tID:"+id+"\tBasic Salary:"+salary+"\tGross="+gross+"\tNet="+net);
	}
	
}
