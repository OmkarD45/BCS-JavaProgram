import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowButton extends JFrame
{
	JButton b1,b2;
	public WindowButton()
	{
		setSize(500,600);
		setVisible(true);
		setLayout(new FlowLayout());
		b1=new JButton("Click Here");
		b2=new JButton("Second Button");
		add(b1);
		add(b2);
	}
	public static void main(String[] args) 
	{
		new WindowButton(); 
	}

}

