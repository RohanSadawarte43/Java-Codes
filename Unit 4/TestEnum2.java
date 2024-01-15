
public class TestEnum2 {
enum Month{
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;

Month(){
	System.out.println("C Invocked");
}
}
public static void main(String[] args) {
	Month d=Month.JAN;
	System.out.println(d+"\t"+d.ordinal());
	}
}


