import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Adharform extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4;
	JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
	JButton b1;
	String s[]={"PRAVARA MEDICAL TRUST","TAMBE HOSPITAL","TATA HOSPITAL","APOLLO HOSPITAL"};
	JComboBox cb1;
	public Adharform()
	{
		setTitle("AadharForm");
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new JLabel("AADHAR NUMBER:");  t1=new JTextField(20);
		l2=new JLabel("  BIRTH  DATE:");  t2=new JTextField(20);
		l3=new JLabel("MOBILE NUMBER:");  t3=new JTextField(20);
		l4=new JLabel("  AGE  GROUP :");  
		rb1=new JRadioButton("18 and Above"); rb2=new JRadioButton("45 and above");
		l5=new JLabel("SELECT HOSPITAL:"); cb1=new JComboBox(s);
		l6=new JLabel("VACCINE TYPE :");  rb3=new JRadioButton("COVISHIELD"); 
		rb4=new JRadioButton("COVAXIN");  rb5=new JRadioButton("SPUTANIK V");
		l7=new JLabel("  TIME  SLOT :");  rb6=new JRadioButton("MORNING"); 
		rb7=new JRadioButton("AFTERNOON"); rb8=new JRadioButton("EVENING");
		b1=new JButton("REGISTER");
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(l4); add(rb1); add(rb2);
		add(l5); add(cb1);
		add(l6); add(rb3); add(rb4); add(rb5);
		add(l7); add(rb6); add(rb7); add(rb8);
		add(b1);
		b1.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		rb4.addActionListener(this);
		rb5.addActionListener(this);
		rb6.addActionListener(this);
		rb7.addActionListener(this);
		rb8.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		new Adharform();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null, "Information Saved Successfully");
		}
	}
}
