import java.awt.*;
class AWTDemo{
public static void main(String args[]){

Frame frame = new Frame("CSC Computer");
frame.setSize(500,500);
frame.setVisible(true);
frame.setLayout(null);

Label label = new Label("Krishna");
label.setBounds(100,100,50,30);
frame.add(label);

Label label2 = new Label("Compouter");
label2.setBounds(200,100,100,30);
frame.add(label2);

TextField tf1 = new TextField("");
tf1.setBounds(100,200,100,30);
frame.add(tf1);

Button button = new Button("Ok");
button.setBounds(200,300,35,35);
frame.add(button);
}
}