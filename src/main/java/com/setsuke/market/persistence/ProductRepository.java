package com.setsuke.market.persistence;

import com.setsuke.market.persistence.crud.ProductCrudRepository;
import com.setsuke.market.persistence.entities.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategoria){
        return productCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Product>> getEscasos(int cantidad){
        return productCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

}
