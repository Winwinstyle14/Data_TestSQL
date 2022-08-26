package com.example.data_testsql.controller;

import com.example.data_testsql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/thang")
    public ModelAndView getAllProduct(){
        return new ModelAndView("index","listProduct",productService.getAllProduct());
    }
}
