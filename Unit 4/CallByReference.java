
public class CallByReference {
int dd,mm,yy;
CallByReference(int dd,int mm,int yy){
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}

public String toString(){
	return("DATE:"+dd+"/"+mm+"/"+yy);
}
public static void main(String[] args) {
	CallByReference []c=new CallByReference[2];
	
	c[0]=new CallByReference(4,3,2001);
	c[1]=new CallByReference(7,6,2019);
	System.out.println("Date1:"+c[0]);
	System.out.println(c[1]);
	swapp(c);
	System.out.println("After Swapping");
	System.out.println(c[0]);
	System.out.println(c[1]);
}
     static void swapp(CallByReference []ca)
{
	CallByReference temp;
	temp=ca[0];
	ca[0]=ca[1];
	ca[1]=temp;
}
}
