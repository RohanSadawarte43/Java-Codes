
public class MarketingExecutives extends Employee {
	float kmt;
	float toa;
	int tea=1500;
	MarketingExecutives(int id, String name,float salary,float kmt)
	{
		super(id,name,salary);
		this.kmt=kmt;	
		toa=kmt*5;
	}
	void grossSalary(){
		gross=salary+hra+(toa+tea);
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
	
	

