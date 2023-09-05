import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener 
{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,min,mul,div,AC,eq;
	JTextField t;
	String x;
	float n1,n2,n3;
	public Calculator()
	{
		super("Calculator");
		setSize(235,400);
		setVisible(true);
		setLayout(new FlowLayout());
		t=new JTextField(20);
		b1=new JButton("1");	b2=new JButton("2");	b3=new JButton("3");
		b4=new JButton("4");	b5=new JButton("5");	b6=new JButton("6");
		b7=new JButton("7");	b8=new JButton("8");	b9=new JButton("9");
		b0=new JButton("0");	plus=new JButton("+");	min=new JButton("-");
		mul=new JButton("*");	div=new JButton("/");	eq=new JButton("=");
		AC=new JButton("AC");
		add(t);		add(b0);	add(b1);	add(b2);	add(b3);
		add(b4);	add(b5);	add(b6);	add(b7);	add(b8);
		add(b9);	add(plus);	add(min);	add(mul);	add(div);
		add(eq);	add(AC);
		b0.addActionListener(this);		b1.addActionListener(this);
		b2.addActionListener(this);		b3.addActionListener(this);
		b4.addActionListener(this);		b5.addActionListener(this);
		b6.addActionListener(this);		b7.addActionListener(this);
		b8.addActionListener(this);		b9.addActionListener(this);
		plus.addActionListener(this);	min.addActionListener(this);
		mul.addActionListener(this);	div.addActionListener(this);
		eq.addActionListener(this);		AC.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b0)
		{
			t.setText("0");
		}
		if(e.getSource()==b1)
		{
			t.setText("1");
		}
		if(e.getSource()==b2)
		{
			t.setText("2");
		}
		if(e.getSource()==b3)
		{
			t.setText("3");
		}
		if(e.getSource()==b4)
		{
			t.setText("4");
		}
		if(e.getSource()==b5)
		{
			t.setText("5");
		}
		if(e.getSource()==b6)
		{
			t.setText("6");
		}
		if(e.getSource()==b7)
		{
			t.setText("7");
		}
		if(e.getSource()==b8)
		{
			t.setText("8");
		}
		if(e.getSource()==b9)
		{
			t.setText("9");
		}
		if(e.getSource()==plus)
		{
			x="+";
			n1=Float.parseFloat(t.getText());
			t.setText("");
		}
		if(e.getSource()==min)
		{
			x="-";
			n1=Float.parseFloat(t.getText());
			t.setText("");
		}
		if(e.getSource()==mul)
		{
			x="*";
				n1=Float.parseFloat(t.getText());
				t.setText("");
		}
		if(e.getSource()==div)
		{
			x="/";
			n1=Float.parseFloat(t.getText());
			t.setText("");
		}
		if(e.getSource()==AC)
		{
			t.setText(""+0);
		}
		if(e.getSource()==eq)
		{
			n2=Float.parseFloat(t.getText());
			if(x=="+")
			{
				n3=n1+n2;
				t.setText(""+n3);
			}
			if(x=="-")
			{
				n3=n1-n2;
				t.setText(""+n3);
			}
			if(x=="*")
			{
				n3=n1*n2;
				t.setText(""+n3);
			}	
			if(x=="/")
			{
				n3=n1/n2;
				t.setText(""+n3);
			}
		}
	}
}