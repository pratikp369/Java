package Applet;
import java.applet.*;
/* <applet code="myapp.class" height="300" width="500"> 
 <param name="s" value="pratik" />
  </applet>*/
import java.awt.*;
public class myapp extends Applet {

//	public void init()
//	{
//		
//	}5
	public void paint(Graphics g)
	{
		String my=getParameter("s");
		g.drawString(my,10,50);
	}
}
