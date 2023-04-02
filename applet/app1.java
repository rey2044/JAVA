import java.applet.*;
import java.awt.*;
/*
<applet code="app1.class" width="300" height="300">
</applet>
*/
public class app1 extends Applet
{
String s1;
public void init()
{
setBackground(Color.blue);
setForeground(Color.magenta);
s1="Naran Lala";
}
public void paint(Graphics g)
{
g.drawString("Good Morning students",10,500);
g.drawString(s1,10,40);
}
}
