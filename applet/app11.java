import java.awt.*;
import java.applet.*;
/*
<applet code ="app11.class" width=200 height=200>
<param name=Roll_no value=94>
<param name=Name value=Rey>
<param name=Stream value=BCA>
</applet>
*/
public class app11 extends Applet
{
String nm;
String rno;
String stream;
public void start()
{

nm=getParameter("Name");
rno=getParameter("Roll_no");
stream=getParameter("Stream");
}
public void paint(Graphics g)
{
g.drawString(rno + " " + nm + " " + stream , 10,10);
}
}