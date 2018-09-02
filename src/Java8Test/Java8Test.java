package Java8Test;

import java.util.ArrayList;

public class Java8Test {

	public static void main(String[] args) {
		
		//functional lambda expressions.
		MathsOperation op = (num, num2) -> num * num2;
		Java8Test test = new Java8Test();
		System.out.println(test.operate(7, 8, op));
		
		//method references - replace lambda with named method
		ArrayList<String> testlist = new ArrayList<>();
		testlist.add("One");
		testlist.add("more");
		testlist.add("step");
		testlist.forEach(System.out::println);
	}
	
	interface MathsOperation {
		int operate(int a, int b);
	}
	
	private int operate(int a, int b, MathsOperation op) {
		return op.operate(a, b);
	}
}
