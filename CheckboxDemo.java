import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CheckboxDemo" width=250 height=200>
</applet>
*/
public class CheckboxDemo extends Applet implements ItemListener{
String msg="";
Checkbox Win2000,linux,unix,WinMe;
public void init(){
Win2000=new Checkbox("Windows200",null,true);
linux=new Checkbox("Linux");
unix=new Checkbox("Unix");
WinMe=new Checkbox("Mac OS");
add(Win2000);
add(linux);
add(unix);
add(WinMe);
Win2000.addItemListener(this);
linux.addItemListener(this);
unix.addItemListener(this);
WinMe.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie){
repaint();
}
public void paint(Graphics g){
msg="Current state: ";
g.drawString(msg,6,80);
msg="Windows2000:"+Win2000.getState();
g.drawString(msg,6,100);
msg="Linux:"+linux.getState();
g.drawString(msg,6,120);
msg="Unix:"+unix.getState();
g.drawString(msg,6,140);
msg="MacOS:"+WinMe.getState();
g.drawString(msg,6,160);
}
}


