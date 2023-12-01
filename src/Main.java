import UIClasses.BaseLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static Connection getConnect() {
        String driver = "org.opengauss.Driver";
        String url = "jdbc:opengauss://localhost:5432/school?currentSchema=school";
        String username = "gaussdb";
        String password = "SH@121314aa";
        Connection conn = null;
        try {
            Class.forName(driver);
        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接成功");
            return conn;
        } catch (
                Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
//        Connection conn = getConnect();
        String sid = "1";
        new BaseLayout();
    }
}
