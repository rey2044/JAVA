import java.applet.*;
import java.awt.*;
/*
<applet code="app14.java" width="300" height="300">
<param name=num1 value=50>
<param name=num2 value=30>
</applet>
*/
public class app14 extends Applet
{
String n1,n2;
int no1,no2,add,sub,mul,div,c,tmp;
public void start()
{
n1=getParameter("num1");
no1=Integer.parseInt(n1);
n2=getParameter("num2");
no2=Integer.parseInt(n2);
add=no1+no2;
sub=no1-no2;
mul=no1*no2;
div=no1/no2;
c=no1*no1*no1;
tmp=mul*c;
}
public void paint(Graphics g)
{
g.drawString("Add: "+add, 20, 20);
g.drawString("Sub: "+sub, 20, 40);
g.drawString("Mul: "+mul, 20, 60);
g.drawString("Div: "+div, 20, 80);
g.drawString("Cube: "+c, 20, 100);
g.drawString("temp: "+tmp, 20, 120);
}
}