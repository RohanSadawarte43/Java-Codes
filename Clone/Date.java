package Clone;

public class Date implements Cloneable{
	int dd,mm,yy;
	Date(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public Object clone(){
		Date temp=null;
		try {
			temp = (Date)super.clone();
		} catch (CloneNotSupportedException e) {
			
		}
		return temp;
	}
	public String toString(){
		return ("Date:"+dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Date d1=new Date(1,1,2001);
		Date d2=(Date)d1.clone();
		System.out.println(d1);
		System.out.println(d2);
	}
}
