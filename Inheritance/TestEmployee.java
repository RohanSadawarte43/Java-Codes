
public class TestEmployee {
	static void showDetails(Employee e){
		e.netSalary();
	}
public static void main(String[]args){
	Manager m1= new Manager(10000,"Rohan",100000);
	MarketingExecutives m2=new MarketingExecutives(10001,"Kartik",200000,100);
	/*m1.grossSalary();
	m1.netSalary();
	m2.grossSalary();
	m2.netSalary();
	System.out.println(m1);
	System.out.println(m2);*/
	Employee e1= new Manager(10002,"Sam",300000);
	showDetails(m1);
	showDetails(m2);
	showDetails(e1);
/*	showDetails();*/

}
}
