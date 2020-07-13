import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener
{

//Initilize Various Vaiables

  private JMenuBar menubar;
  private JMenu Home, Courses, FBPage, PopularCourses,  Communication, Login, Help, Update;
  private JMenuItem MyCourse, DashBoard,AddCourse, Html, Java, C, Cplus, Python, GoogleGo, Link, Java1, Python2, Instructor, Student, Forums, Chat, Help1, Help2, Update1;
  private JLabel Cop, l, Image, label;

//construtor
  Main()
  {
      initComponents();
  }

//Main Code Block
  public void initComponents(){

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800,600);
    this.setTitle("Course Management System");


//Initilize MenuBar
    menubar = new JMenuBar();
    this.setJMenuBar(menubar);

//Adding Menu
    Home = new JMenu("Home");
    Courses = new JMenu("Courses");
    FBPage = new JMenu("FB Page");
    PopularCourses = new JMenu("Popular Courses");
    Communication = new JMenu("Communication");
    Login = new JMenu("Login");
    Help = new JMenu("Help");
    Update = new JMenu("Update");

    menubar.add(Home);
    menubar.add(Courses);
    menubar.add(FBPage);
    menubar.add(PopularCourses);
    menubar.add(Communication);
    menubar.add(Login);
    menubar.add(Help);
    menubar.add(Update);

//Adding MenuItems with ActionListener
    //Home
    MyCourse = new JMenuItem("My Course");
    MyCourse.addActionListener(this);
    DashBoard = new JMenuItem("DashBoard");
    DashBoard.addActionListener(this);

    //Courses
    AddCourse = new JMenuItem("Add Course");
    AddCourse.addActionListener(this);
    Html = new JMenuItem("Html");
    Html.addActionListener(this);
    Java = new JMenuItem("Java");
    Java.addActionListener(this);
    C = new JMenuItem("C");
    C.addActionListener(this);
    Cplus = new JMenuItem("C++");
    Cplus.addActionListener(this);
    Python = new JMenuItem("Python");
    Python.addActionListener(this);
    GoogleGo = new JMenuItem("Go Language");
    GoogleGo.addActionListener(this);

    //FBPage
    Link = new JMenuItem("Link");
    Link.addActionListener(this);

    //PopularCourses
    Java1 = new JMenuItem("1.Java");
    Java1.addActionListener(this);
    Python2 = new JMenuItem("2. Python");
    Python2.addActionListener(this);

    //Communication
    Forums = new JMenuItem("Forums");
    Forums.addActionListener(this);
    Chat = new JMenuItem("ChatBOX");
    Chat.addActionListener(this);

    //Login
    Instructor = new JMenuItem("Instructor");
    Instructor.addActionListener(this);
    Student = new JMenuItem("Student");
    Student.addActionListener(this);

    //Help
    Help1 = new JMenuItem("Help for Student");
    Help2 = new JMenuItem("Help For Instructor");
    Help1.addActionListener(this);
    Help2.addActionListener(this);

    //Update
    Update1 = new JMenuItem("Update in Progress...");
    Update1.addActionListener(this);

    //Initilize MenuItems in Main Menu
    //Home
    Home.add(MyCourse);
    Home.add(DashBoard);

    //Courses
    Courses.add(AddCourse);
    Courses.add(Html);
    Courses.add(Java);
    Courses.add(C);
    Courses.add(Cplus);
    Courses.add(Python);
    Courses.add(GoogleGo);

    //FBPage
    FBPage.add(Link);

    //PopularCourses
    PopularCourses.add(Java1);
    PopularCourses.add(Python2);

    //Communication
    Communication.add(Forums);
    Communication.add(Chat);

    //Login
    Login.add(Instructor);
    Login.add(Student);

    //Help
    Help.add(Help1);
    Help.add(Help2);

    //Update
    Update.add(Update1);

    //Image Adding

    JLabel Image = new JLabel(new ImageIcon("lms.jpeg")); // Image add
    getContentPane().add(Image); //Get on ContenPage

    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("\u00A9 Copyright 2020");
    panel.add(label);
    getContentPane().add(BorderLayout.SOUTH, panel); //Visible on OutPut
  }


//Performing ActionListener

  @Override
  public void actionPerformed(ActionEvent e)
  {
//Home Instructions
    if(e.getSource()==MyCourse){
      JOptionPane.showMessageDialog(this,"Please Login First",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==DashBoard)
    {
      JOptionPane.showMessageDialog(this,"Please Login First",
      "Error",JOptionPane.ERROR_MESSAGE);
    }

// Courses Instructions
    else if(e.getSource()==AddCourse){
      JOptionPane.showMessageDialog(this,"Only Instructor Can Add : Need Instructor Login",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==Html){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==Java){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==C){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==Cplus){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==Python){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==GoogleGo){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }

//FBPage Instructions
    else if(e.getSource()==Link)
    {
      JOptionPane.showMessageDialog(this,"No Link at This Time available!! ",
      "Error",JOptionPane.ERROR_MESSAGE);
    }

//PopularCourses Instructions
    else if(e.getSource()==Java1){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }
    else if(e.getSource()==Python2){
      JOptionPane.showMessageDialog(this,"No Data at this Time",
      "Error",JOptionPane.ERROR_MESSAGE);

    }

//Communication Instructions
    else if(e.getSource()==Forums)
    {
      JOptionPane.showMessageDialog(this,"No Forum Available",
      "Error",JOptionPane.ERROR_MESSAGE);
    }

    else if(e.getSource()==Chat)
    {
      JOptionPane.showMessageDialog(this,"Install Later",
      "Error",JOptionPane.ERROR_MESSAGE);
    }
//Login Instructions
    else if(e.getSource() == Instructor){
      Login LoginPage = new Login();
      LoginPage.setVisible(true);
    }

    else if(e.getSource() == Student){
      Login LoginPage = new Login();
      LoginPage.setVisible(true);
    }


//HelpPage Instructions
    else if(e.getSource()==Help1)
    {
      HelpPage Help = new HelpPage();
      Help.setVisible(true);
    }

    else if(e.getSource()==Help2)
    {
      HelpPage Help = new HelpPage();
      Help.setVisible(true);
    }
//Update Instructions
    else if(e.getSource()==Update1)
    {
      JOptionPane.showMessageDialog(this,"Wait : Update Will Come Soon!! \uD83D\uDE00 . For Proper Use. Till : STAY HOME STAY SAFE",
      "Error",JOptionPane.ERROR_MESSAGE);
    }

  }

//Main method
public static void main(String[] args)
       {
        Main frame = new Main();
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);

      }
}
