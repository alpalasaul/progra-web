package com.krypton.webstore22.controller;

import com.krypton.webstore22.domain.repository.ProductRepository;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("products",
                productRepository.getAllProducts());
        return "products";
    }
}
