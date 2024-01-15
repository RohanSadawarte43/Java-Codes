
public class CallByValue {
int dd,mm,yy;
CallByValue(int dd,int mm,int yy){
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}
public String toString(){
	return("DATE:"+dd+"/"+mm+"/"+yy);
}
 	void swap(CallByValue c1,CallByValue c2){
	CallByValue temp;
	temp=c1;
	c1=c2;
	c2=temp;
	System.out.println("AFTER SWAPPING\nDate 1:"+c1+"\nDate2:"+c2);
}
public static void main(String[] args) {
	CallByValue c1=new CallByValue(4,3,2001);
	CallByValue c2=new CallByValue(4,8,2002);
	System.out.println(c1);
	System.out.println(c2);
	c1.swap(c1,c2);
	/*System.out.println(c1);
	System.out.println(c2);*/
}
}
