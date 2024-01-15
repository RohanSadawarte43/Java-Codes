package oops;

public class GarbageCollectorTest {
	public static void main(String[] args) throws InterruptedException {
		GarbageCollectorTest gct1 = new GarbageCollectorTest();
		GarbageCollectorTest gct2 = new GarbageCollectorTest();

		gct1 = null;
		System.gc();

		gct2 = null;
		Runtime.getRuntime().gc();
	}

	public void finalize() throws Throwable {
		System.out.println("Garbage collector called");
	}
}
