package com.setsuke.market.persistence.crud;

import com.setsuke.market.persistence.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    List<Product> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Product>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
