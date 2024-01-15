
public class TestEnum {
enum Weekday
{
	SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	int no;
	Weekday(int no){
		this.no=no;
	}
	int getDay(){
		return(no); 
	}
}
public static void main(String[]args){
	Weekday w[]=Weekday.values();
	for (int i=0;i<w.length;i++)
	{
		System.out.println(w[i]+"       "+w[i].ordinal());
	}
	
}
}
