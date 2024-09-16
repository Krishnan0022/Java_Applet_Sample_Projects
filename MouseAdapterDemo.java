import java.awt.*;
    import java.awt.event.*;
    import java.applet.*;
    /*
     <applet code="MouseAdapterDemo" width=100 height=100>
     </applet>
     */
    public class MouseAdapterDemo extends Applet{
        public void init(){
            setBackground(Color.green);
            addMouseListener(new MyMouseAdapter(this));
        }
    }
    class MyMouseAdapter extends MouseAdapter{
        MouseAdapterDemo m;
        public MyMouseAdapter(MouseAdapterDemo m){
            this.m=m;
        }
        public void mousePressed(MouseEvent me){
            m.setBackground(Color.red);
            m.repaint();
        }
        public void mousereleased(MouseEvent me){
            m.setBackground(Color.green);
            m.repaint();  
        }
    }
    

