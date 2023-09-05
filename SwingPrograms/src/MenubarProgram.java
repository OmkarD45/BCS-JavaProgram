import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MenubarProgram extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m1,m2,m3,m4;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;
	public MenubarProgram() {
		super("Arithmetic Operation Form");
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		mb=new JMenuBar();
		m1=new JMenu("Math");			m2=new JMenu("Area");		m3=new JMenu("Volume");
		mi1=new JMenuItem("Add");		mi2=new JMenuItem("Sub");	
		m4=new JMenu("Trigonometry"); mi3=new JMenuItem("Sin");
		mi4=new JMenuItem("Cos"); 	mi5=new JMenuItem("Tan");
		mi6=new JMenuItem("Circle");mi7=new JMenuItem("Rectangle");
		m4.add(mi3);	m4.add(mi4);	m4.add(mi5);
		m1.add(mi1);	m1.add(mi2);	m1.add(m4);
		m2.add(mi6);	m2.add(mi7);
		mb.add(m1);		mb.add(m2);		mb.add(m3);
		setJMenuBar(mb);
		mi1.addActionListener(this);	mi2.addActionListener(this);
	}
	public static void main(String[] args) {
		new MenubarProgram();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mi1)
		{
			new AdditionForm();
		}
		if(e.getSource()==mi2) 
		{
			new SubstractionForm();
		}
	}

}
