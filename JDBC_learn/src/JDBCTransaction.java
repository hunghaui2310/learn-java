import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransaction {

    public static void main(String[] args) {
        Connection connection = JDBCConnection.getJDBCConnection();

        try {
            Statement statement = connection.createStatement();
            connection.setAutoCommit(false);

            String sql1 = "INSERT INTO PERSON(id,name) values (2, 'A')";
            String sql2 = "DELETE FROM PERSON WHERE ID = 4";

            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);

            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
