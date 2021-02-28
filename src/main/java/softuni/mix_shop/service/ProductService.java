package softuni.mix_shop.service;

import softuni.mix_shop.model.entity.ProductEntity;

public interface ProductService {
    Iterable<ProductEntity> getAllProducts();
    ProductEntity getProduct(long id);
    ProductEntity save(ProductEntity product);
}
