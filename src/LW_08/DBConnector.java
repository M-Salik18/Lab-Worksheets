package LW_08;

import java.sql.*;

public class DBConnector
{
    private String url ="jdbc:mysql://localhost:3306/SignUp";
    private String username="root";
    private String pw="";
    private Connection connection;
    private PreparedStatement preparedStatement;
    DBConnector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException exception){
            exception.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection(url,username,pw);
           }catch(SQLException exception){
            exception.printStackTrace();
        }

    }
    void addData(String nameq, String emailq, String genderq, String dobq, String passwordq) throws SQLException{
        preparedStatement = connection.prepareStatement("INSERT INTO `user`(`name`, `email`, `gender`, `dob`, `password`) VALUES (?,?,?,?,?)");
        preparedStatement.setString(1,nameq);
        preparedStatement.setString(2,emailq);
        preparedStatement.setString(3,genderq);
        preparedStatement.setString(4,dobq);
        preparedStatement.setString(5,passwordq);
        preparedStatement.execute();
        connection.close();
    }

    boolean getData(String emailq, String passwordq) throws SQLException{
        preparedStatement = connection.prepareStatement("Select email, password from user whereemail=? and password=?");
        preparedStatement.setString(1,emailq);
        preparedStatement.setString(2,passwordq);
        ResultSet rs = preparedStatement.executeQuery();
        return rs.next();
    }
}
