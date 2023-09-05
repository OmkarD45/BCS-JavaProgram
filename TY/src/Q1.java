class Nsum extends Thread{
	public void sum() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum (1 to 10 natural numbers): "+sum);
	}
	@Override
	public void run()
	{
		sum();
	}
}
public class Q1 {
	public static void main(String[] args) {
		Nsum t=new Nsum();
		t.start();
	}
}
