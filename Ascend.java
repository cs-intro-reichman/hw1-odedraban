// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int) Math.ceil(Math.random() * Integer.parseInt(args[0]));
		int b = (int) Math.ceil(Math.random() * Integer.parseInt(args[0]));
		int c = (int) Math.ceil(Math.random() * Integer.parseInt(args[0]));
		System.out.println(a + " " + b + " " + c);
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = (a + b + c) - (min + max);
		System.out.println(min + " " + mid + " " + max);

	}
}
