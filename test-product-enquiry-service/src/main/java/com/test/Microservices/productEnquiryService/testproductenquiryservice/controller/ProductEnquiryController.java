package com.test.Microservices.productEnquiryService.testproductenquiryservice.controller;

import com.test.Microservices.productEnquiryService.testproductenquiryservice.beans.ProductEnquiryBean;
import com.test.Microservices.productEnquiryService.testproductenquiryservice.client.ProductStockClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductEnquiryController {

    @Autowired
    ProductStockClient client;

    @GetMapping("/product-enquiry/name/{name}/availability/{availability}/unit/{unit}")
    public ProductEnquiryBean getEnquiryOfProduct(@PathVariable String name,
                                                  @PathVariable String availability,
                                                  @PathVariable int unit) {

        ProductEnquiryBean productEnquiryBean= client.checkProductStock(name, availability);

        double totalPrice= productEnquiryBean.getProductPrice().doubleValue() * unit;
        double discount=productEnquiryBean.getDiscountOffer();
        double discountedPrice=totalPrice-totalPrice*discount/100;
        return  new ProductEnquiryBean(
                productEnquiryBean.getId(),
                name,
                productEnquiryBean.getProductPrice(),
                availability,
                productEnquiryBean.getDiscountOffer(),
                unit,
                discountedPrice,
                productEnquiryBean.getPort()
        );

    }

}
