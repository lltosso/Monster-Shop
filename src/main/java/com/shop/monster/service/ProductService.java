package com.shop.monster.service;



import com.shop.product.model.Product;
import com.shop.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public void MonsterRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void addMonster( Product newProduct) {
        productRepository.save(newProduct);
    }

    public Optional<Product> findProduct(int id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(int id, Product updateProduct) {
        //Buscar producto por id
        Optional<Product> foundMonster = productRepository.findById(id);

        if (foundMonster.isPresent()) {
            Product existingMonster = foundMonster.get();

            //Actualizar los campos
            existingMonster.setTitle(updatedProduct.getTitle());
            existingMonster.setDescription(updatedProduct.getDescription());
            existingMonster.setAuthor(updatedProduct.getAuthor());
            existingMonster.setIsbn(updatedProduct.getIsbn());
            existingMonster.setGenre(updatedProduct.getGenre()); //
        }
    }




}
