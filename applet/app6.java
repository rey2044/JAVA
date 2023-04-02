import java.applet.*;
import java.awt.*;
/* <applet code = "app6.class" width = 300 height = 300> </applet> */
public class app6 extends Applet
{
public void paint(Graphics g)
{
g.setColor (Color.yellow);
g.fillOval (100,100,100,100);
g.setColor (Color.black);
g.fillOval (120,125,20,30);
g.fillOval (160,125,20,30);

g.setColor (Color.black);
g.drawLine (150,165,150,150);
g.setColor (Color.red);
g.fillRect (130,170,40,10);
g.setColor (Color.black);
g.fillRoundRect(130,170,40,10,10,10);
}
}