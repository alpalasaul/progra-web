package com.krypton.webstore3.controller;

import com.krypton.webstore3.service.ProductService;
import com.krypton.webstore3.domain.repository.ProductRepository;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("market")
@Controller
public class ProductController {

    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("products",
                productService.getAllProducts());
        return "products";
    }

    @Autowired
    private ProductService productService;

    @RequestMapping("/update/stock")
    public String updateStock(Model model) {
        productService.updateAllStock();
        return "redirect:/products";
    }

    @RequestMapping("/products/{category}")
    public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
        model.addAttribute("products", productService.getProductsByCategory(productCategory));
        return "products";
    }

}
