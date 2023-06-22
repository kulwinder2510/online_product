package shipcarte.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shipcarte.project.Entity.Product;
import shipcarte.project.Service.ProductService;

import javax.security.auth.Subject;
import java.util.List;
import java.util.Optional;

@RestController

public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value="/getProduct",method= RequestMethod.GET)
    public List<Product> retrieveAllProducts(){
        return this.productService.getProduct();
    }


     @RequestMapping(value="/getProductById/{id}",method= RequestMethod.GET)
    public Product getProductById(@PathVariable Integer id){
        return this.productService.findOne(id);
    }

    @PostMapping(value="/addProduct")
    public ResponseEntity<Object> addProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return ResponseEntity.created(null).build();
    }

    @RequestMapping(value="/updateProduct/{id}")
    public String updateProduct(@PathVariable int id){
        String product=productService.updateProduct(id);
        return product;
    }

    @DeleteMapping(value="/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        String product=productService.removeProduct(id);
        return product;
    }
}
