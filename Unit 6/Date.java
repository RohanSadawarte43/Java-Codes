
class DateU6 {
	int dd, mm, yy;

	DateU6(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		System.out.println("Date:" + dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {
		DateU6 d1 = new DateU6(1, 1, 2001);
		DateU6 d2 = new DateU6(1, 1, 2001);
		// d1=d2;
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}
