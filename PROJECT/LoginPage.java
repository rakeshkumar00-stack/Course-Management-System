
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener
{
 JButton LOGIN,REGISTER;
 JPanel panel;
 JLabel label1,label2;
 final JTextField  text1,text2;
  Login()
  {
    setSize(400, 600);
    getContentPane().setBackground(Color.LIGHT_GRAY);

  //frame.setSize(300.300);
  label1 = new JLabel();
  label1.setText("Username:");
  text1 = new JTextField(15);

  label2 = new JLabel();
  label2.setText("Password:");
  text2 = new JPasswordField(15);

  LOGIN=new JButton("LOGIN");
  REGISTER = new JButton("REGISTER");

  panel=new JPanel(new GridLayout(3,1));
  panel.add(label1);
  panel.add(text1);
  panel.add(label2);
  panel.add(text2);
  panel.add(LOGIN);
  panel.add(REGISTER);
  add(panel, BorderLayout.NORTH);
  LOGIN.addActionListener(this);
  setTitle("LOGIN PAGE");
  }
 public void actionPerformed(ActionEvent ae)
  {
  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  String value1=text1.getText();
  String value2=text2.getText();
  if (value1.equals("admin") && value2.equals("admin")) {
  NextPage page=new NextPage();
  page.setVisible(true);
  JLabel label = new JLabel("Login Successfully!!");
  page.getContentPane().add(label);
  }
  else{
  System.out.println("Enter the valid username and password");
  JOptionPane.showMessageDialog(this,"Incorrect login or password",
  "Error",JOptionPane.ERROR_MESSAGE);
  }
}
}
 class LoginPage
{
  public static void main(String arg[])
  {

  try
  {
  Login frame=new Login();
  frame.setVisible(true);
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}
