
public class Constructor {
int day,month,year;
	Constructor(){
	day=1;
	month=1;
	year=2000;
}
	Constructor(int day,int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	Constructor(int a){
		this(3+a,a+99 );
	}
	Constructor(int d,int m){
		day=d;
		month=m;
		year=d+m;
	} 

public static void main(String[]args){
	Constructor c1=new Constructor();
	Constructor c2=new Constructor(29,6,2019);
	Constructor c3=new Constructor(29);
	c1.showData();
	c2.showData();
	c3.showData();
}
void showData(){
	System.out.println("Date:"+day+"/"+month+"/"+year);
	
}
}