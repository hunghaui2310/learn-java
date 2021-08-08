import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSet {

    public static void main(String[] args) throws SQLException {

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();

        jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/doan");
        jdbcRowSet.setUsername("root");
        jdbcRowSet.setPassword("123456");

        String sql = "SELECT * FROM PERSON";

        jdbcRowSet.setCommand(sql);
        jdbcRowSet.execute();

        while (jdbcRowSet.next()) {
            System.out.println(jdbcRowSet.getInt("id") + jdbcRowSet.getString("name"));
        }
    }
}
