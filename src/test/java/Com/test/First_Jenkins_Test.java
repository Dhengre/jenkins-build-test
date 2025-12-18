package Com.test;



public class First_Jenkins_Test {

    // method under test
	public class App {
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        System.out.println("Sum of 2 + 3 = " + add(2,3));
	    }
	}
}