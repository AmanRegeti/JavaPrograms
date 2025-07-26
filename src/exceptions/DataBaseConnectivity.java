package exceptions;
import java.sql.*;

public class DataBaseConnectivity {
    public static void main(String[] args) {
        try {
            connect();
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Exception occurred " + e);
        } catch (Exception e) {
            System.out.println("Exception occurred " + e);
        }
    }
    //private static void connect() throws Exception {
    private static void connect() throws ClassNotFoundException, SQLException {
        Statement st = null;
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // establish connection
            String url = "mysql://something";
            String username = "something";
            String password = "something";
            c = DriverManager.getConnection(url, username, password);
            st = c.createStatement();
            String query = "select count(*) from person";
            int count = st.executeUpdate(query);
            System.out.println("Number of rows affected by this query" + count);

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
            throw e;
        } catch (SQLException e) {
            throw e;
        } finally {
            System.out.println("hello");
            try {
                if (st != null) {
                    st.close();
                }
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                System.out.println("Did not open");
            }
        }
        System.out.println("Connection closed");

        }
    }

