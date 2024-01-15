
public class TestStudent {
	static void WeHaveToOverRide(Student s1234){
		s1234.showDetails();
	}
public static void main(String[]args){
	Student s1=new Student(1,"Rohan",99.99f);
	StudentExam s2=new StudentExam(2,"Rahul",98.99f,0.66f,0.06f);
	WeHaveToOverRide(s1);
	WeHaveToOverRide(s2);
}
}
