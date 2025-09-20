package com.turkcell.app.repository;

import com.turkcell.app.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements BaseRepository<Product> {

    List<Product> products = new ArrayList<Product>();

    public List<Product> findAll(){
       return products;
    }

    public Product findById(int id){
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    public void save(Product user){

    }

    public void delete(Product user){

    }
}
