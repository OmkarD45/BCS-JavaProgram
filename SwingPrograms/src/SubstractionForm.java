import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SubstractionForm extends JFrame implements ActionListener{
	JButton b1,b2;			JLabel l1,l2,l3;
	JTextField t1,t2,t3;	float n1,n2,n3;
	public SubstractionForm() {
		super("Addition Form");
		setVisible(true);
		setSize(300,300);
		setLayout(new FlowLayout());
		l1=new JLabel("Enter the First no");
		l2=new JLabel("Enter the Second no");
		l3=new JLabel("Substraction of two nos");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b1=new JButton("Sub");
		b2=new JButton("Clear");
		add(l1);	add(t1);	add(l2);	add(t2);
		add(l3);	add(t3);	add(b1);	add(b2);
		b1.addActionListener(this);		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		new SubstractionForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			n1=Float.parseFloat(t1.getText());
			n2=Float.parseFloat(t2.getText());
			n3=n1-n2;
			t3.setText(""+n3);
		}		
		if(e.getSource()==b2)
		{
			t1.setText("");		t2.setText("");		t3.setText("");
		}
	}
}
