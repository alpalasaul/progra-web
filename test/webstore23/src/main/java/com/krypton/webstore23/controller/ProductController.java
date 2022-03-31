package com.krypton.webstore23.controller;

import com.krypton.webstore23.domain.repository.ProductRepository;
import com.krypton.webstore23.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("products",
                productRepository.getAllProducts());
        return "products";
    }

    @RequestMapping("/update/stock")
    public String updateStock(Model model) {
        productService.updateAllStock();
        return "redirect:/products";
    }

}
