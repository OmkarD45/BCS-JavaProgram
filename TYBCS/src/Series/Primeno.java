package Series;

public class Primeno {
    public void prime(int n)
    {
        int i,j,f;
        for (i=2;i<=n;i++)
        {
            f=0;
            for(j=2;j<i;j++)
            {
                if (i%j==0)
                {
                    f=1;
                }
            }
            if (f==0)
            {
                System.out.print(""+i+"\t");
            }
        }
    }
}
