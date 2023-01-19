package fibonacci1;

public class Fibonacci {
	static int fib(int a) {
		if (a == 0 || a == 1) {
			return 0;
		} else if (a == 2) {
			return 1;
		}
		return fib(a - 1) + fib(a - 2);
	}

	public static void main(String args[]) {
		int n = 10;
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fib(n) + ".");
	}
}