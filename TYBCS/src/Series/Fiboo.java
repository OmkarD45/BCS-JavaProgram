package Series;

public class Fiboo {
    public void fibo(int n)
    {
        int m1=0,m2=1,m3,i;
        System.out.print(""+m1+"\t"+m2);
        for(i=2;i<n;i++)
        {
            m3=m1+m2;
            System.out.print("\t"+m3);
            m1=m2;
            m2=m3;
        }
    }
}
