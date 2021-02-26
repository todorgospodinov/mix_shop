package softuni.mix_shop.web;

import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import softuni.mix_shop.model.entity.ProductEntity;
import softuni.mix_shop.model.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull
    Iterable<ProductEntity> getProducts() {
        return productService.getAllProducts();
    }
}