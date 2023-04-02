import java.awt.*;
import java.applet.*;
/*
<applet code="app10.class" width=300 height=300>
</applet>
*/
public class app10 extends Applet
{
public void paint(Graphics g)
{

g.setColor(Color.blue);
g.fillOval(50,50,550,550);

g.setColor(Color.magenta);
g.drawLine(150,500,500,500);

g.drawLine(300,180,150,500);
g.drawLine(300,180,500,500);
g.setColor(Color.red);
Font f= new Font("Comic Sans MS",Font.BOLD,24);
g.setFont(f);
g.drawString("Naran Lala",280,360);
}
}