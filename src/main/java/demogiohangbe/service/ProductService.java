package demogiohangbe.service;

import demogiohangbe.model.Product;
import demogiohangbe.repository.IProductRepository;
import demogiohangbe.service.Impl.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;


    @Override
    public Product save(Product product) {
        return iProductRepository.save(product);
    }

    @Override
    public Optional<Product> findById(long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) iProductRepository.findAll();
    }

    @Override
    public ArrayList<Product> findAllByName(String name) {
        return null;
    }

    @Override
    public void delete(Product product) {
        iProductRepository.delete(product);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.save(product);
    }
}
