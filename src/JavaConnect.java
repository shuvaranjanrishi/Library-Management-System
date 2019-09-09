import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    
    private static Connection con;
    
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","");
            return con;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
