
public class Student {
	int roll;
	String name;
	float marks;
	Student(int roll,String name,float marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	void showDetails(){
		System.out.println("Name:"+name+"\tRoll No.:"+roll+"\tMarks:"+marks);
	}

}
