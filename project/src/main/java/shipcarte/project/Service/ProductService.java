package shipcarte.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shipcarte.project.Entity.Product;
import shipcarte.project.Repository.ProductRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    static List<Product> product = new ArrayList<>();

    static {
        product.add(new Product(221, "Apple10", "ApplePhone", 17500));
        product.add(new Product(222, "Apple11", "ApplePhone", 23500));
        product.add(new Product(223, "SamsungA2", "SamsungPhone", 11200));
        product.add(new Product(224, "OppoG7", "OppoPhone", 13400));
        product.add(new Product(225, "Nokia2510", "NokiaPhone", 9000));
    }

    public static List<Product> getProduct() {
        return product;
    }

    public Product findOne(int id) {
        for (Product product : product) {
            return product;
        }
        return null;
    }

    public String saveProduct(Product product) {
        return "Product SAVED";
    }

    public String removeProduct(int id) {
        return "Product REMOVED";
    }

    public void addProduct(Product product) {
    }

    public void updateProduct(String id, Product product) {
    }

    public String updateProduct(int id) {
        return "Product UPDATED";
    }
}
