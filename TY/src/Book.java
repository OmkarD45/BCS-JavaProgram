import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book 
{
	int ISBN;
	String name,author,publisher;
	double rate;
	Book(int ISBN, String name, String author, String publisher, double rate)
	{
		this.ISBN=ISBN;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.rate=rate;
	}
	void display()
	{
		System.out.println(""+ISBN+"\t"+name+"\t"+author+"\t"+publisher+"\t"+rate);
	}
	public static void main(String[] args) throws IOException 
	{
		int i,n,ISBN;
		String name,author,publisher;
		double rate;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many books:");
		n=Integer.parseInt(b.readLine());
		Book bk[]=new Book[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter details of book-1 (ISBN,name,author,publisher,rate)");
			ISBN=Integer.parseInt(b.readLine());
			name=b.readLine();
			author=b.readLine();
			publisher=b.readLine();
			rate=Double.parseDouble(b.readLine());
			bk[i]=new Book(ISBN,name,author,publisher,rate);
		}
		System.out.println("ISBN\tName\tAuthor\tPublisher\tRate");
		for(i=0;i<n;i++)
		{
			bk[i].display();
		}
	}

}
