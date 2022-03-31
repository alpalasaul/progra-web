package com.krypton.webstore3.controller;

import com.krypton.webstore3.domain.Product;
import com.krypton.webstore3.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.MatrixVariable;

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

    @RequestMapping("/products/filter/{params}")
    public String getProductsByFilter(@MatrixVariable(pathVar = "params") Map<String, List<String>> filterParams, Model model) {
        model.addAttribute("products", productService.getProductsByFilter(filterParams));    
        System.out.println(filterParams);
        return "products";
    }

}
