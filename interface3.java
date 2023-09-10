import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class interface3 extends JFrame {
private JLabel label1;
private JLabel label2;
private JLabel label3;
private JLabel label4;
private JLabel label5;
private JLabel label6;
private JTextField text1;
private JTextField text2;
private JTextField text3;
private JButton button1;
private JComboBox box1;
private JComboBox box2;
 
 
private String[]Month= {"01","02","03","04","05","06","07","08","09","10","11","12"};
private  String[]Year= {"2024","2025","2025","2026","2027","2028","2029","2030"};
 
public interface3() {
super("Programming Project1");
setLayout(null);
 
label1=new JLabel("Please Enter your card detalis ");
label1.setFont(new Font("Serif",Font.PLAIN,50));
label1.setHorizontalTextPosition(SwingConstants.LEFT);
label1.setBounds(100,100,5000,100);
add(label1);
 
Icon ic=new ImageIcon(getClass().getResource("/piic.png"));
label6=new JLabel("");
label6.setIcon(ic);
label6.setBounds(750,150,50000000,500);
add(label6);
 
label2=new JLabel("Card number :");
label2.setFont(new Font("Serif",Font.PLAIN,20));
label2.setHorizontalTextPosition(SwingConstants.CENTER);
label2.setVerticalTextPosition(SwingConstants.CENTER);
label2.setBounds(150,200,800,25);
add(label2);
 
text1=new JTextField(60);
text1.setBounds(160,250,200,25);
add(text1);
 
label3=new JLabel("Expiry date :");
label3.setFont(new Font("Serif",Font.PLAIN,20));
label3.setHorizontalTextPosition(SwingConstants.CENTER);
label3.setVerticalTextPosition(SwingConstants.CENTER);
label3.setBounds(150,300,800,30);
add(label3);
 
box1=new JComboBox(Month);
box1.setMaximumRowCount(12);
box1.setBounds(160,350,50,25);
add(box1);
 
box2=new JComboBox(Year);
box1.setMaximumRowCount(7);
box2.setBounds(220,350,50,25);
add(box2);
 
label4=new JLabel("Name on card :");
label4.setFont(new Font("Serif",Font.PLAIN,20));
label4.setHorizontalTextPosition(SwingConstants.CENTER);
label4.setVerticalTextPosition(SwingConstants.CENTER);
label4.setBounds(150,400,800,25);
add(label4);
 
text2=new JTextField(30);
text2.setBounds(160,450,200,25);
add(text2);
 
label5=new JLabel("Card security code  :");
label5.setFont(new Font("Serif",Font.PLAIN,20));
label5.setHorizontalTextPosition(SwingConstants.CENTER);
label5.setVerticalTextPosition(SwingConstants.CENTER);
label5.setBounds(150,500,800,25);
add(label5);
 
text3=new JTextField(30);
text3.setBounds(160,550,200,25);
add(text3);
 
button1=new JButton("Pay now");
Color color=new Color(255,102,0);
button1.setBackground(color);
button1.setForeground(Color.white);
button1.setBounds(320,620,200,25);
add(button1);
 
Handller1 handller=new Handller1();
button1.addActionListener(handller);
}
private class Handller1 implements ActionListener{
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null,"Process is done successfully ..","Payment procces", JOptionPane.PLAIN_MESSAGE);
}
 
}}
