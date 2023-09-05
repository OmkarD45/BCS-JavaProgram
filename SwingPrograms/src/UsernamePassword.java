import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.FontAttribute;
public class UsernamePassword extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1;
	JPasswordField p1;
	Font f;
	public UsernamePassword()
	{
		setSize(800,400);
		setVisible(true);
		setLayout(null);
		f=new Font("Times New Roman",Font.ITALIC,20);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		b1=new JButton("Login");
		b2=new JButton("Cancel");
		t1=new JTextField(20);
		p1=new JPasswordField(20);
		l1.setFont(f);
		l2.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		t1.setFont(f);
		p1.setFont(f);
		l1.setBounds(140,30,140,30);
		t1.setBounds(300,30,240,30);
		l2.setBounds(140,90,140,30);
		p1.setBounds(300,90,240,30);
		b1.setBounds(250,150,100,25);
		b2.setBounds(370,150,100,25);
		add(l1);
		add(t1);
		add(l2);
		add(p1);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		new UsernamePassword();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			if(t1.getText().equals("Omkar") && p1.getText().equals("Sairam@123"))
			{
				JOptionPane.showMessageDialog(null, "Login Succesful");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Username and Password not match");
				t1.setText("");
				p1.setText("");
			}
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			p1.setText("");
		}
	}

}
