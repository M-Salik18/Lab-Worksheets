package LW_07;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(600, 600);
        frame.setLayout(null);       // No panels, absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String uname = "root";
        String pw = "";
        String URL = "jdbc:mysql://localhost:3306/registration";


        // Labels
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(30, 30, 100, 25);
        frame.add(lblName);

        JLabel lblMobile = new JLabel("Mobile");
        lblMobile.setBounds(30, 70, 100, 25);
        frame.add(lblMobile);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(30, 110, 100, 25);
        frame.add(lblGender);

        JLabel lblDOB = new JLabel("DOB");
        lblDOB.setBounds(30, 150, 100, 25);
        frame.add(lblDOB);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(30, 190, 100, 25);
        frame.add(lblAddress);

        // TextFields
        JTextField tfName = new JTextField();
        tfName.setBounds(120, 30, 150, 25);
        frame.add(tfName);

        JTextField tfMobile = new JTextField();
        tfMobile.setBounds(120, 70, 150, 25);
        frame.add(tfMobile);

        // Gender Radio Buttons
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(120, 110, 60, 25);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(180, 110, 80, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        frame.add(male);
        frame.add(female);

        // DOB Combo boxes
        String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14", "15",
                "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul",
                "Aug","Sep","Oct","Nov","Dec"};

        String[] years = new String[75];
        int y = 1950;
        for(int i=0; i<75; i++) years[i] = String.valueOf(y+i);

        JComboBox<String> cbDay = new JComboBox<>(days);
        cbDay.setBounds(120, 150, 50, 25);

        JComboBox<String> cbMonth = new JComboBox<>(months);
        cbMonth.setBounds(175, 150, 60, 25);

        JComboBox<String> cbYear = new JComboBox<>(years);
        cbYear.setBounds(240, 150, 70, 25);

        frame.add(cbDay);
        frame.add(cbMonth);
        frame.add(cbYear);

        // Address TextArea
        JTextArea taAddress = new JTextArea();
        taAddress.setBounds(120, 190, 200, 60);
        frame.add(taAddress);

        // Terms checkbox
        JCheckBox chkTerms = new JCheckBox("Accept Terms And Conditions.");
        chkTerms.setBounds(120, 260, 200, 25);
        frame.add(chkTerms);

        // Submit Button
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(120, 300, 80, 30);
        frame.add(btnSubmit);

        // Reset Button
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(210, 300, 80, 30);
        frame.add(btnReset);

        // Output area
        JTextArea output = new JTextArea();
        output.setEditable(false);
        output.setBounds(350, 40, 200, 400);
        frame.add(output);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            Connection connection = DriverManager.getConnection(URL,uname,pw);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO 'user' ('name','mobile','gender','dob','address') VALUES (?,?,?,?,?);");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

        // Submit Action
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (!chkTerms.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Please accept Terms!",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String gender;
                if(male.isSelected()){
                    gender = "Male";
                } else if (female.isSelected()) {
                    gender = "Female";
                }else {
                    gender = "Not selected";
                }

                String info = "Name: " + tfName.getText() +
                        "\nMobile: " + tfMobile.getText() +
                        "\nGender: " + gender +
                        "\nDOB: " + cbDay.getSelectedItem() + "-" +
                        cbMonth.getSelectedItem() + "-" +
                        cbYear.getSelectedItem() +
                        "\nAddress: " + taAddress.getText();

                output.setText(info);

                try{
                    Connection connection = DriverManager.getConnection(URL,uname,pw);
                    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `user`(`name`, `mobile`, `gender`, `dob`, `address`) VALUES (?,?,?,?,?);");
                    preparedStatement.setString(1,tfName.getText());
                    preparedStatement.setInt(2, Integer.parseInt(tfMobile.getText()));
                    preparedStatement.setString(3,gender);
                    preparedStatement.setString(4,cbDay.getSelectedItem() + "-" +
                            cbMonth.getSelectedItem() + "-" +
                            cbYear.getSelectedItem());
                    preparedStatement.setString(5,taAddress.getText());
                    preparedStatement.execute();
                    connection.close();


                } catch (SQLException exception){
                    exception.printStackTrace();
                }


            }
        });

        // Reset Action
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfName.setText("");
                tfMobile.setText("");
                genderGroup.clearSelection();
                cbDay.setSelectedIndex(0);
                cbMonth.setSelectedIndex(0);
                cbYear.setSelectedIndex(0);
                taAddress.setText("");
                chkTerms.setSelected(false);
                output.setText("");
            }
        });

        frame.setVisible(true);
    }
}
