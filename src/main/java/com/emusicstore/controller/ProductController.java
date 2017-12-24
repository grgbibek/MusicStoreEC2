package com.emusicstore.controller;

import com.emusicstore.Service.ProductService;
import com.emusicstore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by grgbibek22 on 8/4/2017.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/productList")
    public String getProducts(Model model){
        List<Product> products = productService.getProductList();
        model.addAttribute("products",products);

        return "productList";

    }
    @RequestMapping("/viewProduct/{id}")
    public String viewProduct(@PathVariable(value="id") int id,Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product",product);

        return "viewProduct";
    }

}
