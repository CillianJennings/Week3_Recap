package ie.atu.week2_refresher_test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name = "inventory-service", url = "http://localhost:8081")
public interface Inventory {
    @PostMapping("/inventory/add")
    String storeProduct(Product product);
}
