package oops;

public class ObjectReferenceVariables {
	static public int r;
	public float o;
	public char h;
	public boolean a;
	public static String n = "Rohan";

	public static void main(String[] args) {
		ObjectReferenceVariables ob = new ObjectReferenceVariables();
		ObjectReferenceVariables.r = 3;
		System.out.println(ObjectReferenceVariables.r);
		n = "p";
		System.out.println(n);
	}
}
