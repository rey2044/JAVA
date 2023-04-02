import java.awt.*;
import java.applet.*;
/*
<applet code="app7.class" width=230 height=210>
</applet>
*/
public class app7 extends Applet {
public void paint(Graphics g) {
int xpoints[] = {30, 200, 30, 200 };
int ypoints[] = {30, 30, 200, 200} ;
int num = 4;
g.drawPolygon(xpoints, ypoints, num);
}
}