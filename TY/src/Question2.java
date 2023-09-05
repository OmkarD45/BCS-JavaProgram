class NaturalSum extends Thread{
	public void natural() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum (natural 1 to 10): "+sum);
	}
	public void run() {
		natural();
	}
}
class EvenSum extends Thread{
	public void even() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum (even 1 to 10): "+sum);
	}
	public void run() {
		even();
	}	
}
class OddSum extends Thread{
	public void odd() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum (odd 1 to 10): "+sum);
	}
	public void run() {
		odd();
	}	
}
public class Question2 {
	public static void main(String[] args) {
		NaturalSum t1=new NaturalSum();
		EvenSum t2=new EvenSum();
		OddSum t3=new OddSum();
		t1.start();
		t2.start();
		t3.start();
	}
}
