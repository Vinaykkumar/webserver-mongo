# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.swagger.client.codegen.rest.invoker.*;
import com.swagger.client.codegen.rest.invoker.auth.*;
import com.swagger.client.codegen.rest.model.*;
import com.swagger.client.codegen.rest.api.ProductControllerApi;

import java.io.File;
import java.util.*;

public class ProductControllerApiExample {

    public static void main(String[] args) {
        
        ProductControllerApi apiInstance = new ProductControllerApi();
        Product product = new Product(); // Product | product
        try {
            Product result = apiInstance.createProductUsingPOST(product);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductControllerApi#createProductUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductControllerApi* | [**createProductUsingPOST**](docs/ProductControllerApi.md#createProductUsingPOST) | **POST** /products/create | createProduct
*ProductControllerApi* | [**deleteProductUsingDELETE**](docs/ProductControllerApi.md#deleteProductUsingDELETE) | **DELETE** /products/{id} | deleteProduct
*ProductControllerApi* | [**getAllProductsUsingGET**](docs/ProductControllerApi.md#getAllProductsUsingGET) | **GET** /products/fetching | getAllProducts
*ProductControllerApi* | [**getProductByIdUsingGET**](docs/ProductControllerApi.md#getProductByIdUsingGET) | **GET** /products/{id} | getProductById
*ProductControllerApi* | [**updateProductUsingPUT**](docs/ProductControllerApi.md#updateProductUsingPUT) | **PUT** /products/{id} | updateProduct


## Documentation for Models

 - [OptionalProduct](docs/OptionalProduct.md)
 - [Product](docs/Product.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



