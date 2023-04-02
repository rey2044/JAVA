import java.util.Calendar;
import java.awt.*;
import java.applet.*;
/*
<applet code="app8.class" width=300 height=300>
</applet>
*/
public class app8 extends Applet implements Runnable{
Thread t;
int hh,mm,ss;
public void init(){
if(t==null){
t=new Thread(this);
t.start();
}
}
public void run(){
for(;;){
Calendar tm= Calendar.getInstance();
hh = tm.get(Calendar.HOUR);
mm = tm.get(Calendar.MINUTE);
ss = tm.get(Calendar.SECOND);
repaint();
try{
Thread.sleep(1000);
}
catch(Exception e){
}
}
}
public void paint(Graphics g){
String now="";
now=String.valueOf(hh)+":"+String.valueOf(mm)+":"+String.valueOf(
ss);
g.drawString(now,50,50);
}
}