import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class interface2 extends JFrame {
       private JLabel label1;
       private JLabel label2;
       private JLabel labeltext1;
       private JTextField text1;
       private JLabel labelbox1;
       private JComboBox box1;
       private JLabel labelbox2;
       private JComboBox box2;
       private JLabel labeltext2;
       private JTextField text2;
       private JLabel labelbox3;
       private JComboBox box3;
       private JCheckBox check1;
       private JButton button1;
       private JLabel success;
       private Font font;
      
       private static final String[]gender= {"Male","Female"};
       private static final String[]nationality= {"Kingdom of Saudi Arabia","United Arab Emirates","Kuwait","Qatar","Oman","Bahrain","Egypt","Tunisia","America"};
       private static final String[]DateOfBirth= {"1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004"};
 
 
      
       public interface2() {
              super("test");
              setLayout(null);
             
              label1=new JLabel("Please enter your information..");
              label1.setFont(new Font("serif",Font.PLAIN,50));
              label1.setHorizontalTextPosition(SwingConstants.LEFT);
              label1.setBounds(100,100,5000,60);
              add(label1);
             
              Icon ic=new ImageIcon(getClass().getResource("/piic.png"));
              label2=new JLabel("");
              label2.setIcon(ic);
              label2.setBounds(730,100,50000000,500);
              add(label2);
             
              labeltext1=new JLabel("Enter your name:");
              font =new Font("Serif",Font.PLAIN,23);
              labeltext1.setFont(font);
              labeltext1.setBounds(100,200,800,25);
              add(labeltext1);
             
              text1=new JTextField("",25);
              text1.setBounds(300,200,80,25);
              add(text1);
             
              labelbox1=new JLabel("Enter your gender:");
              font =new Font("Serif",Font.PLAIN,23);
              labelbox1.setFont(font);
              labelbox1.setBounds(100,250,800,30);
              add(labelbox1);
             
              box1=new JComboBox(gender);
              box1.setMaximumRowCount(2);
              box1.setBounds(300,250,165,25);
              add(box1);
             
              labelbox2=new JLabel("Enter nationality:");
              font =new Font("Serif",Font.PLAIN,23);
              labelbox2.setFont(font);
              labelbox2.setBounds(100,300,800,30);
              add(labelbox2);
             
              box2=new JComboBox(nationality);
              box2.setMaximumRowCount(2);
              box2.setBounds(300,300,180,25);
              add(box2);
             
              labeltext2=new JLabel("Enter ID number:");
              font =new Font("Serif",Font.PLAIN,23);
              labeltext2.setFont(font);
              labeltext2.setBounds(100,350,800,25);
              add(labeltext2);
             
              text2=new JTextField("",25);
              text2.setBounds(300,350,190,25);
              add(text2);
             
              labelbox3=new JLabel("Enter Date of birth:");
              font =new Font("Serif",Font.PLAIN,23);
              labelbox3.setFont(font);
              labelbox3.setBounds(100,400,800,30);
              add(labelbox3);
             
              box3=new JComboBox(DateOfBirth);
              box3.setMaximumRowCount(2);
              box3.setBounds(300,400,200,25);
              add(box3);
             
              check1=new JCheckBox("Agree to the terms");
              check1.setBounds(300,460,220,25);
              add(check1);
             
              button1=new JButton("Next");
              button1.setBounds(350,500,240,25);
              Color color=new Color(255,102,0);
              button1.setBackground(color);
              button1.setForeground(Color.white);
              add(button1);
             
              success=new JLabel("");
              success.setBounds(380,540,240,25);
              add(success);
             
              Handller  handlle=new Handller ();
              button1.addActionListener(handlle);
 
              }
              private class Handller  implements ActionListener{
              public void actionPerformed (ActionEvent e) {
                     interface3 L=new interface3();
              L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              L.setSize(10000,10000);
              L.setVisible(true);
              }
 
 
 
              }}