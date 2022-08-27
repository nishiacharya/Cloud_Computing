import java.rmi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.server.*;
public class AddClient extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2,res;
	JButton b1;
	AddClient()
	{
		super("Sum of two numbers");
		l1=new JLabel("Number 1");
		l2=new JLabel("Number 2");
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("SUM");
		res=new JTextField(10);
		res.setEditable(false);
		b1.addActionListener(this);
		getContentPane().setLayout(new GridLayout(3,2));
		getContentPane().add(l1);
		getContentPane().add(t1);
		getContentPane().add(l2);
		getContentPane().add(t2);
		getContentPane().add(b1);
		getContentPane().add(res);
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hai");
		try
		{
			AddInt addobj=(AddInt)Naming.lookup("rmi://localhost/sum");
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			res.setText(""+addobj.addTwoNo(n1,n2));
		}
		catch(Exception e1)
		{
			System.out.println("Error"+e1);
		}	
	}
	public static void main(String args[])
	{
		try
		{
			AddClient a=new AddClient();
			a.setVisible(true);
			a.setSize(500,300);
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}	
	}
}