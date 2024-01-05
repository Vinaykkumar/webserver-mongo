package com.example.demo.cont;//package com.example.demo.cont;

import com.swagger.client.codegen.rest.model.OptionalProduct;
import com.swagger.client.codegen.rest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.swagger.client.codegen.rest.api.ProductControllerApi; // Import the correct class
import java.util.List;


@RestController
@RequestMapping("/svc/v1/api/product")
public class ClientController {

    @Autowired
    private ProductControllerApi productControllerApi;


    @GetMapping("/{id}")
    public OptionalProduct getProduct(@PathVariable String id) {
        // Use the 'product' parameter if needed
        return productControllerApi.getProductByIdUsingGET(id);
    }

    @GetMapping("/all")
    public List<Product> getProducts(){
        return productControllerApi.getAllProductsUsingGET();
    }
    // POST endpoint to create a new product
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productControllerApi.createProductUsingPOST(product);
    }

    // PUT endpoint to update an existing product
    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        return productControllerApi.updateProductUsingPUT(id, product);
    }

    // DELETE endpoint to delete a product by ID
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable String id) {
        productControllerApi.deleteProductUsingDELETE(id);
    }
}