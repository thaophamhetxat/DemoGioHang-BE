package demogiohangbe.service;

import demogiohangbe.model.Category;
import demogiohangbe.repository.ICategoryRepository;
import demogiohangbe.service.Impl.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public Category save(Category category) {
        return iCategoryRepository.save(category);
    }

    @Override
    public Optional<Category> findById(long id) {
        return iCategoryRepository.findById(id);
    }

    @Override
    public ArrayList<Category> findAll() {
        return (ArrayList<Category>) iCategoryRepository.findAll();
    }

    @Override
    public ArrayList<Category> findAllByName(String name) {
        return null;
    }

    @Override
    public void delete(Category category) {
        iCategoryRepository.delete(category);
    }

    @Override
    public void edit(Category category) {
        iCategoryRepository.save(category);
    }
}
