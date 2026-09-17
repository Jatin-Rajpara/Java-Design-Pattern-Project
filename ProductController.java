import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addProduct")
public class ProductController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));

        Product product = new Product();

        product.setId(id);
        product.setName(name);
        product.setPrice(price);

        ProductDAO dao = new ProductDAO();

        dao.addProduct(product);

        request.getRequestDispatcher("product-list.jsp")
               .forward(request, response);
    }
}