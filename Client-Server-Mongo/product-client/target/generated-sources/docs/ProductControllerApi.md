# ProductControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductUsingPOST**](ProductControllerApi.md#createProductUsingPOST) | **POST** /products/create | createProduct
[**deleteProductUsingDELETE**](ProductControllerApi.md#deleteProductUsingDELETE) | **DELETE** /products/{id} | deleteProduct
[**getAllProductsUsingGET**](ProductControllerApi.md#getAllProductsUsingGET) | **GET** /products/fetching | getAllProducts
[**getProductByIdUsingGET**](ProductControllerApi.md#getProductByIdUsingGET) | **GET** /products/{id} | getProductById
[**updateProductUsingPUT**](ProductControllerApi.md#updateProductUsingPUT) | **PUT** /products/{id} | updateProduct


<a name="createProductUsingPOST"></a>
# **createProductUsingPOST**
> Product createProductUsingPOST(product)

createProduct

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
Product product = new Product(); // Product | product
try {
    Product result = apiInstance.createProductUsingPOST(product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#createProductUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| product |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteProductUsingDELETE"></a>
# **deleteProductUsingDELETE**
> deleteProductUsingDELETE(id)

deleteProduct

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
String id = "id_example"; // String | id
try {
    apiInstance.deleteProductUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#deleteProductUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllProductsUsingGET"></a>
# **getAllProductsUsingGET**
> List&lt;Product&gt; getAllProductsUsingGET()

getAllProducts

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
try {
    List<Product> result = apiInstance.getAllProductsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#getAllProductsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getProductByIdUsingGET"></a>
# **getProductByIdUsingGET**
> OptionalProduct getProductByIdUsingGET(id)

getProductById

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
String id = "id_example"; // String | id
try {
    OptionalProduct result = apiInstance.getProductByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#getProductByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**OptionalProduct**](OptionalProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateProductUsingPUT"></a>
# **updateProductUsingPUT**
> Product updateProductUsingPUT(id, product)

updateProduct

### Example
```java
// Import classes:
//import com.swagger.client.codegen.rest.invoker.ApiException;
//import com.swagger.client.codegen.rest.api.ProductControllerApi;


ProductControllerApi apiInstance = new ProductControllerApi();
String id = "id_example"; // String | id
Product product = new Product(); // Product | product
try {
    Product result = apiInstance.updateProductUsingPUT(id, product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductControllerApi#updateProductUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **product** | [**Product**](Product.md)| product |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

