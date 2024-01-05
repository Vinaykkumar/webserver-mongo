package com.example.demo.conf;

import com.swagger.client.codegen.rest.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.swagger.client.codegen.rest.api.ProductControllerApi; // Import the correct class


import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ProductConfig {

    @Value("${product.profile.host.uri}")
    private String hostInfoBasePath;

    @Bean
    public ApiClient apiClient() {
        return new ApiClient().setBasePath(hostInfoBasePath);
    }

   @Bean
    public ProductControllerApi productControllerApi(){
        return new ProductControllerApi (apiClient());
   }
}
