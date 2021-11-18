package demogiohangbe.service.Impl;

import demogiohangbe.model.Product;

import java.util.ArrayList;
import java.util.Optional;

public interface IProductService {
    Product save(Product product);
    Optional<Product> findById(long id);

    ArrayList<Product> findAll();

    ArrayList<Product> findAllByName(String name);

    void delete(Product product);

    void edit(Product product);
}
