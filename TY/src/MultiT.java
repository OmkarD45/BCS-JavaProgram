class NaturalAdd extends Thread{
	public void addition() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum (1 to 10 natural nos): "+sum);
	}
	@Override
	public void run()
	{
		addition();
	}
}
public class MultiT {
	public static void main(String[] args) {
		NaturalAdd t=new NaturalAdd();
		t.start();
	}
}
