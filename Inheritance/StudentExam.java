
public class StudentExam extends Student{
	float m1,m2;
	StudentExam(int roll,String name,float marks, float m1,float m2){
		super(roll,name,marks);
		this.m1=m1;
		this.m2=m2;
	}
	void showDetails(){
		marks=marks+m1+m2;
		System.out.println("Name:"+name+"\tRoll No.:"+roll+"\tMarks:"+marks);
	}
}

