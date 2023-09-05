
public class Agg1 {
	StudentM s;
	public Agg1(StudentM s) {
		this.s=s;
	}
	public static void main(String[] args) {
		StudentM m=new StudentM(1,"Om");
		Agg1 a=new Agg1(m);
		a.display();
	}
	void display() {
		System.out.println(s.roll+"\t"+s.n);
	}
}
