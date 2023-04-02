import java.awt.*;
import java.applet.*;
/*
<applet code="app9.class" width=300 height=300>
<font
</applet>
*/
public class app9 extends Applet
{
Font f= new Font("Comic Sans MS",Font.BOLD,20);
public void paint(Graphics g)
{
g.setFont(f);
g.drawString("Have a nice day dear all ",50,50);
}
}