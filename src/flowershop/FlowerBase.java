package flowershop;

import java.sql.*;

public class FlowerBase {
    private static final String url = "jdbc:mysql://localhost:3306/flowershop";
    private static final String user = "yurii";
    private static final String password = "789456123qwe";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static Flower[] getFlowersBase() {
        String query = "SELECT * FROM flowers;";
        Flower[] flowers;
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            rs.last();
            int size = rs.getRow();
            flowers = new Flower[size];
            rs.beforeFirst();

            int index;
            while(rs.next()) {
                index = rs.getRow() - 1;
                flowers[index] = new Flower();
                flowers[index].setId(rs.getInt("id"));
                flowers[index].setName(rs.getString("name"));
                flowers[index].setType(rs.getString("type"));
                flowers[index].setSpecies(rs.getString("species"));
                flowers[index].setSubspecies(rs.getString("subspecies"));
                flowers[index].setPrice(rs.getDouble("price"));
                flowers[index].setAmount(rs.getInt("amount"));
            }
            return flowers;
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                con.close();
            }
            catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                stmt.close();
            }
            catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                rs.close();
            }
            catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return null;
    }
}
