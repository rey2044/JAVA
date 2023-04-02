import java.applet.*;
import java.awt.*;
/* <applet code = "app3.class" width = 300 height = 300> </applet> */
public class app3 extends Applet
{
public void paint(Graphics g)
{
g.drawOval(100,100,100,100);
g.fillOval(120,125,20,20);
g.fillOval(160,125,20,20);
g.drawLine(150,165,150,150);
g.drawLine(130,170,170,170);
}
}