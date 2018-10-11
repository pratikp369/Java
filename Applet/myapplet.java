package Applet;
import java.applet.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class myapplet extends Applet {

/* <applet code="myapplet.class" height="500" width="400"> </applet> */
	
	
	Label lb;
	Label lb2;
	Label lb3;
	TextField tx;
	TextField tx2;
	Button b;
	public void init()
	{
		lb = new Label("Enter Number 1:");
		lb2 =  new Label("Enter Number 2:");
		lb3 = new Label("");
		tx = new TextField("");
		tx2 = new TextField("");
		b  = new Button("Magic");
		setLayout(null);
		lb.setBounds(10,50,100,20);
		lb2.setBounds(10,100,100,20);
		tx.setBounds(150,50,100,20);
		tx2.setBounds(150,100,100,20);
		b.setBounds(150,150,100,20);
		lb3.setBounds(180,180,100,20);
		add(lb);
		add(lb2);
		add(tx);  
		add(tx2);
		add(b);
		add(lb3);
		b.addActionListener(new handler());
	}
	public class handler implements ActionListener
	{
	
		public void actionPerformed(ActionEvent ae)
		{
			int a,b,s;
			a=Integer.parseInt(tx.getText());
			b=Integer.parseInt(tx2.getText());
			s=a+b;
			lb3.setText("The Sum is : "+s);
		}
	}

}
