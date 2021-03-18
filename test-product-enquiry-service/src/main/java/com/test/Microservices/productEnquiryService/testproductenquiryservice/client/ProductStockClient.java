package com.test.Microservices.productEnquiryService.testproductenquiryservice.client;

import com.test.Microservices.productEnquiryService.testproductenquiryservice.beans.ProductEnquiryBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name ="test-product-stock-service", url="localhost:8800")
@FeignClient(name ="test-product-stock-service")
public interface ProductStockClient {

    @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                                @PathVariable String productAvailability);
}
