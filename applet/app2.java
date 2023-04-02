import java.awt.*;
import java.applet.*;
/*
<applet code="app2.class" width=300 height=200>
</applet>
*/
public class app2 extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10, 20, 10, 100);
g.drawLine(0, 100, 100, 0);
g.drawLine(40, 25, 250, 180);
g.drawLine(75, 90, 400, 400);
g.drawLine(20, 150, 400, 40);
g.drawLine(5, 290, 80, 19);

}
}