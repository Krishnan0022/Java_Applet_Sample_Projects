import java.awt.*;
class AWTScreen{
public static void main(String args[]){

Frame frame= new Frame("Login Page");
frame.setSize(400,600);
frame.setVisible(true);
frame.setLayout(null);

Label label = new Label(" Firstname ");
label.setBounds(100,100,50,50);
frame.add(label);

TextField tf=new TextField("");
tf.setBounds(100,150,100,35);
frame.add(tf);

Label label2= new Label("Lastname");
label2.setBounds(100,200,50,50);
frame.add(label2);

TextField tf1=new TextField("");
tf1.setBounds(100,250,100,35);
frame.add(tf1);

Label label3= new Label("Username");
label3.setBounds(100,300,50,50);
frame.add(label3);

TextField tf2=new TextField("");
tf2.setBounds(100,350,100,35);
frame.add(tf2);

Button button = new Button("Ok");
button.setBounds(200,500,35,35);
frame.add(button);

}
}