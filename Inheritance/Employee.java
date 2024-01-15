
public class Employee {
	int id;
	String name;
	float salary,hra,pf,gross,net;
	int pt=200;
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		hra=salary*0.5f;
		pf=salary*0.12f;
	}
	void grossSalary(){
		gross=salary+hra;
	}
	void netSalary(){
		grossSalary();
		net=gross-(pt+pf);
		System.out.println("Net:"+net);
	}
}
