import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Button extends JFrame implements ActionListener 
{
	Font f;
	JButton b1,b2;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	Button()
	{
		setSize(500,400);
		setVisible(true);
		setLayout(new FlowLayout());
		//f=new Font("Times New Roman", Font.BOLD,20);
		l1=new JLabel("Enter the first no");
		l2=new JLabel("Enter the second no");
		l3=new JLabel("Addition of two nos is");
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		b1=new JButton("Add");
		b2=new JButton("AC");		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		new Button();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			String aa=t1.getText();
			String bb=t2.getText();
			int a=Integer.parseInt(aa);
			int b=Integer.parseInt(bb);
			int c=a+b;
			t3.setText(""+c);
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}