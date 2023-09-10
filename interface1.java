import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
 
public class interface1 extends JFrame {
       private JButton button;
       private JLabel label1;
       private JLabel label2;
       private JLabel label3;
       private Font font;
       private Font font2;
 
public interface1 () {
 
super("Programming project");
setLayout(null);
 
label1=new JLabel("أهلاً بـــكم فـي مطـار الجــوف");
font =new Font("Serif",Font.PLAIN,50);
label1.setFont(font);
label1.setSize(label1.getPreferredSize());
label1.setLocation(100,300);
label1.setForeground(getForeground());
add(label1);
 
label2=new JLabel("Welcome to Aljouf Airport ");
font =new Font("Serif",Font.PLAIN,50);
label2.setFont(font);
label2.setSize(label2.getPreferredSize());
label2.setLocation(50,370);
Color color=new Color(255,239,213);
label2.setBackground(color);
add(label2);
 
Icon bug=new ImageIcon(getClass().getResource("/air2.jpg"));
label3=new JLabel("");
label3.setIcon(bug);
label3.setBounds(0,0,50000000,700);
add(label3);
 
button=new JButton("أبــدأ الان .. Start now");
font2=new Font("Serif",Font.PLAIN,20);
button.setFont(font2);
button.setSize(label2.getPreferredSize());
button.setLocation(50,500);
Color color1=new Color(204,204,204);
button.setBackground(color1);
button.setForeground(Color.black);
add(button);
 
button1 handlle=new button1();
button.addActionListener(handlle);
 
}
private class button1 implements ActionListener{
public void actionPerformed (ActionEvent e) {
       interface2 L=new interface2();
L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
L.setSize(10000,10000);
L.setVisible(true);
}
 
 
 
}}
