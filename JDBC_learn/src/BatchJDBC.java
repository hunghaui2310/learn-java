import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchJDBC {

    public static void main(String[] args) {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql1 = "INSERT INTO PERSON(id, name) values (1, 'A')";
        String sql2 = "INSERT INTO PERSON(id, name) values (2, 'B')";
        String sql3 = "INSERT INTO PERSON(id, name) values (3, 'C')";

        try {
            Statement statement = connection.createStatement();

            statement.addBatch(sql1);
            statement.addBatch(sql2);
            statement.addBatch(sql3);

            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
