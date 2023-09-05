import javax.swing.*;
import java.awt.*;
public class LabelTextbox extends JFrame 
{
	JButton b1,b2;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	public LabelTextbox()
	{
		setSize(600,400);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new JLabel("Enter the First Number");
		l2=new JLabel("Enter the Second Number");
		l3=new JLabel("Addition of two Numbers");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		b1=new JButton("Add");
		b2=new JButton("Clear");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		
	}
	public static void main(String[] args) 
	{
		new LabelTextbox();
	}

}
