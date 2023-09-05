import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;

import javax.swing.*;
import java.io.*;
import java.util.*;
public class Notepad extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu file,edit,view;
	JMenuItem n,open,save,print,cut,copy,paste,sall,status,wordwrap,font;
	JTextArea ta;
	JFileChooser jc;
	public Notepad() {
		super("Notepad Application");
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		mb=new JMenuBar();
		file=new JMenu("File");		edit=new JMenu("Edit");		view=new JMenu("View");
		n=new JMenuItem("New");		open=new JMenuItem("Open");	save=new JMenuItem("Save");
		print=new JMenuItem("Print");cut=new JMenuItem("Cut");	copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");sall=new JMenuItem("Select All");
		status=new JMenuItem("Status");wordwrap=new JMenuItem("Wordwrap");
		font=new JMenuItem("Font");
		ta=new JTextArea();
		ta.setBounds(0,0,1275,625);
		file.add(n);		file.add(open);		file.add(save);
		edit.add(print);	edit.add(cut);		edit.add(copy);
		edit.add(paste);	edit.add(sall);
		view.add(status);	view.add(wordwrap);	view.add(font);
		mb.add(file);		mb.add(edit);		mb.add(view);
		setJMenuBar(mb);
		add(ta);
		n.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		print.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		sall.addActionListener(this);
	}
	public static void main(String[] args) {
		new Notepad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				if(e.getSource()==n)
				{
					ta.setText("");
				}
				if(e.getSource()==open)
				{
					jc=new JFileChooser();
					int result=jc.showOpenDialog(this);
					if(result==JFileChooser.APPROVE_OPTION)
					{
						try {
							ta.setText("");
							Scanner s= new Scanner(new FileReader(jc.getSelectedFile().getPath())); 
							while(s.hasNext())
							{
								ta.append(s.nextLine()+"\n");
							}
						}catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				if(e.getSource()==save)
				{
					jc=new JFileChooser();
					int result=jc.showSaveDialog(this);
					if(result==jc.APPROVE_OPTION)
					{
						try {
							BufferedWriter bw=new BufferedWriter(new FileWriter(jc.getSelectedFile().getPath()));
							bw.write(ta.getText());
							bw.close();
							JOptionPane.showMessageDialog(null, "File Saved Successfully");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				if(e.getSource()==print)
				{
					try {
						ta.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource()==cut)
				{
					ta.cut();
				}
				if(e.getSource()==copy)
				{
					ta.copy();
				}
				if(e.getSource()==paste)
				{
					ta.paste();
				}
				if(e.getSource()==sall)
				{
					ta.selectAll();
				}
	}

}
