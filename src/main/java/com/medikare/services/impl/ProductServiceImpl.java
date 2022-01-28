package com.medikare.services.impl;

import java.util.List;
import java.util.Optional;

import com.medikare.model.Product;
import com.medikare.repository.ProductRepository;
import com.medikare.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired 
    private ProductRepository productRepository;
    
    public List<Product> getAlProducts(){
        return this.productRepository.findAll();
    }

    public Product addProduct(Product product){
        return this.productRepository.save(product);
    }

    public void deleteProduct(long id){
        this.productRepository.deleteById(id);
    }

    public Optional<Product> getProductById(long id){
        return this.productRepository.findById(id);
    }

    public List<Product> getProductByCategoryId(int id){
        return this.productRepository.findAllByCategory_Id(id);
    }

    @Override
    public Product updateProduct(long id, Product product) {
        product.setId(id);
        return this.productRepository.save(product) ;
    }

    @Override
    public List<Product> getProductsByQuery(String query) {
        return this.productRepository.findByNameContainingIgnoreCase(query);
    }

   
}
