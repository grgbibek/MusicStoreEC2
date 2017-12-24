package com.emusicstore.Service;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by grgbibek22 on 8/4/2017.
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
