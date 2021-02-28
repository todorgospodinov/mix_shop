package softuni.mix_shop.service;


import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import softuni.mix_shop.model.entity.ProductEntity;
import softuni.mix_shop.repository.ProductRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public ProductEntity getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public ProductEntity save(ProductEntity product) {
        return productRepository.save(product);
    }
}