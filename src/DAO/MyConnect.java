package DAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MyConnect {
    String user="root";
    String pass="";
    String url="jdbc:mysql://localhost:3306/qlbanmaytinh?useUnicode=yes&characterEncoding=UTF-8";
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    public void getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection(url, user, pass);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Lỗi kết nối database");
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Lỗi kết nối database");
        }
    }
    
    public void closeConnect(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getC() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
         Connection con;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlbanmaytinh?useUnicode=yes&characterEncoding=UTF-8", "root", "");
         return con;
    }
}
