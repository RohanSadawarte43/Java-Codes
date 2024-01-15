package Interface;

class Date implements Printable{
	int dd,mm,yy;
	Date(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void show(){
		System.out.println("Date:"+dd+"/"+mm+"/"+yy);
	}
		
}
