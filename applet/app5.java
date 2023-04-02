import java.applet.*;
import java.awt.*;
/* <applet code = "app5.class" width = 300 height = 300> </applet> */
public class app5 extends Applet
{
public void paint(Graphics g)
{
g.setColor (Color.yellow);
g.fillOval (100,100,100,100);
g.setColor (Color.black);
g.fillRect (120,125,20,20);
g.fillRect (160,125,20,20);
g.drawLine (135,135,160,135);
g.setColor (Color.red);
g.drawLine (150,165,150,150);
g.drawLine (130,170,170,170);
}
}