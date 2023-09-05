public class Assign1B2 {
	private int n;
	public Assign1B2() {
		n=0;
	}
	public Assign1B2(int n) {
		this.n=n;
	}
	public static void isNegative(int n) {
		if(n<0) {
			System.out.println("The no is negative");
		}
	}
	public static void isPositive(int n) {
		if(n>0) {
			System.out.println("The no is positive");
		}
	}
	public static void isZero(int n) {
		if(n==0) {
			System.out.println("The no is zero");
		}
	}
	public static void isOdd(int n) {
		if(n%2!=0) {
			System.out.println("The no is Odd");
		}
	}
	public static void isEven(int n) {
		if(n%2==0) {
			System.out.println("The no is Even");
		}
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		isNegative(n);
		isPositive(n);
		isZero(n);
		isEven(n);
		isOdd(n);
	}
}
