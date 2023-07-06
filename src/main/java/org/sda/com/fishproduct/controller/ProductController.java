package org.sda.com.fishproduct.controller;

import jakarta.validation.Valid;
import org.sda.com.fishproduct.model.Product;
import org.sda.com.fishproduct.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add-product")

    public String showAddProductPage(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/add-product")

    public String addProduct(@ModelAttribute("product") @Valid Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-product";
        }
        productService.create(product);
        return "redirect:/add-product?success";
    }

    @GetMapping("/update-product/{id}")
    public String showUpdateProductPage(@PathVariable("id") int id, Model model) {
        Product product = productService.findById(id)
                .orElseThrow();
        model.addAttribute("product", product);

        return "update-product";
    }

    @PostMapping("/update-product/{id}")
    public String updateProduct(@PathVariable("id") int id, @Valid Product product, BindingResult result) {
        if (result.hasErrors()) {
            return "update-product";
        }

        product.setId(id);
        productService.create(product);

        return "redirect:/";
    }
}
