import javax.swing.*;
import java.awt.*;

class HelpPage extends JFrame
 {
   private JMenuBar menubar;
   private JMenu Home;
   private JMenuItem Student, Instructor;

   HelpPage()
  {
  setDefaultCloseOperation(javax.swing.
   WindowConstants.DISPOSE_ON_CLOSE);

   getContentPane().setBackground(Color.CYAN);


   //Adding menubar
   menubar = new JMenuBar();
   this.setJMenuBar(menubar);
   Home = new JMenu("Home");
   menubar.add(Home);

   //Addding JMenuItem
   Student = new JMenuItem("Help For Student");
   Instructor = new JMenuItem("Help For Instructor");

   Home.add(Student);
   Home.add(Instructor);


   //Adding main label
    Label lbl = new Label ("Help Instructions!!!");
    lbl.setBounds(30,80,300,30);
    add(lbl);
    setTitle("HELP WINDOW");
    setLayout(null);
    setVisible(true);
    setSize(600, 500);


  }

  // Main
  public static void main(String[] args) {
     HelpPage obj = new HelpPage();
   }
}
