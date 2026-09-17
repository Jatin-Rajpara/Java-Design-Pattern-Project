import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {

    String url = "jdbc:mysql://localhost:3306/java";
    String username = "root";
    String password = "Jatin#2618";

    public void addProduct(Product product) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "insert into products values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, product.getId());
            ps.setString(2, product.getName());
            ps.setDouble(3, product.getPrice());

            ps.executeUpdate();

            System.out.println("Product added");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getAllProducts() {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "select * from products";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getDouble("price"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}