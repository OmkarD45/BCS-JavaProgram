import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class NotepadFont extends JFrame implements ActionListener {
	JLabel l1,l2,l3;	JButton b1,b2;		JComboBox c1,c2,c3;
	String s1[]= {"Font1","Font2","Font3","Font4"};
	String s2[]= {"Style1","Style2","Style3","Style4"};
	String s3[]= {"Size1","Size2","Size3","Size4"};
	JTextArea ta; 		String a1,a2,a3;
	public NotepadFont() {
		setTitle("Fonts");
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		l1=new JLabel("Font:");			l1.setBounds(40,30,140,30);
		l2=new JLabel("Font Style:");	l2.setBounds(180,30,140,30);
		l3=new JLabel("Size:");			l3.setBounds(320,30,140,30);
		c1=new JComboBox(s1);			c1.setBounds(40,60,80,30);
		c2=new JComboBox(s2);			c2.setBounds(180,60,80,30);
		c3=new JComboBox(s3);			c3.setBounds(320,60,80,30);
		b1=new JButton("OK");			b1.setBounds(240,400,60,30);
		b2=new JButton("Cancel");		b2.setBounds(320,400,80,30);
		add(l1);		add(c1);		add(l2);		add(c2);	
		add(l3);		add(c3);		add(b1);		add(b2);
		ta=new JTextArea();      		ta.setBounds(140,100,160,30);
		add(ta);
		b1.addActionListener(this);		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		new NotepadFont();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null, "Font, size & style added successful");
			dispose();
		}
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null, "You have cancel");
			dispose();
		}
	}

}
