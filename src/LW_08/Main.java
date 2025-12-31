package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        frame.setBounds(10,10,350,575);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        DBConnector dbConnector = new DBConnector();

        JLabel signup=new JLabel("Sign Up");
        signup.setForeground(Color.BLUE);
        signup.setBounds(125,25,100,25);
        signup.setFont(new Font("Arial", Font.BOLD,14));
        frame.add(signup);

        JLabel nmeLbl = new JLabel("Name");
        nmeLbl.setBounds(30,70,100,25);
        frame.add(nmeLbl);

        JLabel emailLbl = new JLabel("Email");
        emailLbl.setBounds(30,110,100,25);
        frame.add(emailLbl);

        JLabel genderLbl = new JLabel("Gender");
        genderLbl.setBounds(30,150,100,25);
        frame.add(genderLbl);

        JLabel birthdayLbl = new JLabel("Birthday");
        birthdayLbl.setBounds(30,190,100,25);
        frame.add(birthdayLbl);

        JLabel passLbl = new JLabel("Password");
        passLbl.setBounds(30,230,100,25);
        frame.add(passLbl);

        JTextField nmeText=new JTextField();
        nmeText.setBounds(120,70,180,25);
        frame.add(nmeText);

        JTextField emailText=new JTextField();
        emailText.setBounds(120,110,180,25);
        frame.add(emailText);

        JRadioButton maleRb = new JRadioButton("Male");
        maleRb.setBounds(120,150,75,25);
        frame.add(maleRb);

        JRadioButton femaleRb = new JRadioButton("Female");
        femaleRb.setBounds(195,150,75,25);
        frame.add(femaleRb);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRb);
        genderGroup.add(femaleRb);

        String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14", "15",
                "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul",
                "Aug","Sep","Oct","Nov","Dec"};

        String[] years = new String[75];
        int y = 1950;
        for(int i=0; i<75; i++) years[i] = String.valueOf(y+i);

        JComboBox<String> cbDay = new JComboBox<>(days);
        cbDay.setBounds(120, 190, 50, 25);

        JComboBox<String> cbMonth = new JComboBox<>(months);
        cbMonth.setBounds(175, 190, 60, 25);

        JComboBox<String> cbYear = new JComboBox<>(years);
        cbYear.setBounds(240, 190, 70, 25);

        frame.add(cbDay);
        frame.add(cbMonth);
        frame.add(cbYear);

        JPasswordField password = new JPasswordField();
        password.setBounds(120, 230, 180, 25);
        frame.add(password);

        JCheckBox chkTerms = new JCheckBox("I am not a Robot.");
        chkTerms.setBounds(25, 270, 200, 25);
        frame.add(chkTerms);

        JButton signupBtn = new JButton("SignUp");
        signupBtn.setBounds(25,310,290,25);
        signupBtn.setBackground(Color.BLUE);
        signupBtn.setForeground(Color.WHITE);
        frame.add(signupBtn);
        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(chkTerms.isSelected())){
                    JOptionPane.showMessageDialog(frame, "Please Confirm that you are not a Robot",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(frame, "Sign up Successful!");
                String nameq = nmeText.getText();
                String emailq = emailText.getText();
                String genderq = maleRb.isSelected()?"Male":"Female";
                String dobq = cbDay.getSelectedItem() + "/" + cbMonth.getSelectedItem() + "/" + cbYear.getSelectedItem();
                String passwordq = password.getText();
                try{
                    dbConnector.addData(nameq,emailq,genderq,dobq,passwordq);
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }

            }
        });


        JLabel signIn=new JLabel("Sign In");
        signIn.setForeground(Color.BLUE);
        signIn.setBounds(125,370,100,25);
        signIn.setFont(new Font("Arial", Font.BOLD,14));
        frame.add(signIn);

        JLabel SignInemailLbl = new JLabel("Email");
        SignInemailLbl.setBounds(30,410,100,25);
        frame.add(SignInemailLbl);

        JLabel SignInPass = new JLabel("Password");
        SignInPass.setBounds(30,450,100,25);
        frame.add(SignInPass);

        JTextField SignInemailText=new JTextField();
        SignInemailText.setBounds(120,410,180,25);
        frame.add(SignInemailText);

        JPasswordField SignInpassword = new JPasswordField();
        SignInpassword.setBounds(120, 450, 180, 25);
        frame.add(SignInpassword);

        JButton signInBtn = new JButton("SignUp");
        signInBtn.setBounds(25,490,290,25);
        signInBtn.setBackground(Color.BLUE);
        signInBtn.setForeground(Color.WHITE);
        frame.add(signInBtn);
        signInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String SUemail = emailText.getText();
//                String SIemail = SignInemailText.getText();
//                String SUpass = password.getText();
//                String SIpass = SignInpassword.getText();
//                if(!(SUemail.equals(SIemail) && SUpass.equals(SIpass))){
//                    JOptionPane.showMessageDialog(frame,"Sign In unsuccessful!","Warning",JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
//                JOptionPane.showMessageDialog(frame,"Sign In successful!");
                String email=SignInemailText.getText();
                String password = SignInpassword.getText();
                try{
                    if(dbConnector.getData(email,password)){
                        JOptionPane.showMessageDialog(frame,"Sign in Successful");
                    }else{
                        JOptionPane.showMessageDialog(frame,"Sign in unsuccessful");
                    }
                }catch(SQLException ex){
                    throw new RuntimeException(ex);



                }

            }
        });




        frame.setVisible(true);




    }
}
