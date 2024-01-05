package com.example.demo.contr;
import com.example.demo.product.Product;
import com.example.demo.product.ProductController;
import com.example.demo.product.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.Arrays;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ComponentScan(basePackages = {"com.example.demo", "com.example.demo.product"})
public class ProductControllerTest {
    // your test methods


    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateProduct() throws Exception {
        Product product = new Product("1", "Test Product", 10.99);

        when(productService.createProduct(any(Product.class))).thenReturn(product);

        mockMvc.perform(MockMvcRequestBuilders.post("/products/create")
                        .content(asJsonString(product))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(product.getId()))
                .andExpect(jsonPath("$.name").value(product.getName()))
                .andExpect(jsonPath("$.price").value(product.getPrice()))
                .andDo(print());

    }

    @Test
    public void testGetAllProducts() throws Exception {
        Product product1 = new Product("abc10", "darshan", 10000.0);
        Product product2 = new Product("abc20", "pen", 20000.0);

        when(productService.getAllProducts()).thenReturn(Arrays.asList(product1, product2));

        mockMvc.perform(MockMvcRequestBuilders.get("/products/fetching"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(product1.getId()))
                .andExpect(jsonPath("$[0].name").value(product1.getName()))
                .andExpect(jsonPath("$[0].price").value(product1.getPrice()))
                .andExpect(jsonPath("$[1].id").value(product2.getId()))
                .andExpect(jsonPath("$[1].name").value(product2.getName()))
                .andExpect(jsonPath("$[1].price").value(product2.getPrice()))
                .andDo(print());
    }


    @Test
    public void testGetProductById() throws Exception {
        Product product = new Product("abc10", "darshan", 10000.00);

        when(productService.getProductById("abc10")).thenReturn(Optional.of(product));

        mockMvc.perform(MockMvcRequestBuilders.get("/products/{id}", "abc10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(product.getId()))
                .andExpect(jsonPath("$.name").value(product.getName()))
                .andExpect(jsonPath("$.price").value(product.getPrice()))
                .andDo(print());
    }

    @Test
    public void testUpdateProduct() throws Exception {
        Product updatedProduct = new Product("1", "Updated Product", 10000.0);

        when(productService.updateProduct(eq("1"), any(Product.class))).thenReturn(updatedProduct);

        mockMvc.perform(MockMvcRequestBuilders.put("/products/{id}", "1")
                        .content(asJsonString(updatedProduct))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(updatedProduct.getId()))
                .andExpect(jsonPath("$.name").value(updatedProduct.getName()))
                .andExpect(jsonPath("$.price").value(updatedProduct.getPrice()))
                .andDo(print());
    }

    @Test
    public void testDeleteProduct() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/products/{id}", "1"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    // Utility method to convert an object to JSON
    private String asJsonString(Object object) throws Exception {
        return new ObjectMapper().writeValueAsString(object);
    }
}
