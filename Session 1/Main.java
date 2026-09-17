class Product {

    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

interface ProductDAO {

    void addProduct(Product p);

    void getProductById(int id);

    void deleteProduct(int id);
}

class ProductDAOImpl implements ProductDAO {

    public void addProduct(Product p) {
        System.out.println("Product added: " + p.name);
    }

    public void getProductById(int id) {
        System.out.println("Getting product with ID: " + id);
    }

    public void deleteProduct(int id) {
        System.out.println("Product deleted with ID: " + id);
    }
}

public class Main {

    public static void main(String[] args) {

        Product p = new Product(1, "Laptop", 50000);

        ProductDAOImpl dao = new ProductDAOImpl();

        dao.addProduct(p);
        dao.getProductById(1);
        dao.deleteProduct(1);
    }
}