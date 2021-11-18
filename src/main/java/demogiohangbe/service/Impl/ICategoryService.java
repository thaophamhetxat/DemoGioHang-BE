package demogiohangbe.service.Impl;

import demogiohangbe.model.Category;

import java.util.ArrayList;
import java.util.Optional;

public interface ICategoryService {
    Category save(Category category);
    Optional<Category> findById(long id);

    ArrayList<Category> findAll();

    ArrayList<Category> findAllByName(String name);

    void delete(Category category);

    void edit(Category category);
}
