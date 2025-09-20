package com.turkcell.app.repository;

import com.turkcell.app.entity.Product;

import java.util.List;

public class MssqlProductRepository implements BaseRepository<Product> {


    public List<Product> findAll(){
        return List.of();
    }

    public Product findById(int id){
        return null;
    }

    public void save(Product user){

    }

    public void delete(Product user){

    }


}
