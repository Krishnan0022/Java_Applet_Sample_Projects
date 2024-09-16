import java.applet.*;
import java.awt.*;
/*
<applet code= "Labels" width =200 Height=200>
</applet>
*/
public class Labels extends Applet{

public void init(){
String s="Hello World";
Label L1= new Label(s,Label.LEFT);
add(L1);
Label L2= new Label(s,Label.RIGHT);
add(L2);
Label L3= new Label(s,Label.CENTER);
add(L3);
}
}
