class NoSum extends Thread{
	public void naturalno() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum (natural): "+sum);
	}
	public void run() {
		naturalno();
	}
}
class ESum extends Thread{
	public void evenno() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum (even): "+sum);
	}
	public void run() {
		evenno();
	}	
}
class OSum extends Thread{
	public void oddno() {
		int i,sum=0;
		for(i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum (odd): "+sum);
	}
	public void run() {
		oddno();
	}	
}
public class Q2 {
	public static void main(String[] args) {
		NoSum t1=new NoSum();
		ESum t2=new ESum();
		OSum t3=new OSum();
		t1.start();
		t2.start();
		t3.start();
	}
}

