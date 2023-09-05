package ss4.bt.model.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ss4.bt.model.entity.Category;
import ss4.bt.model.repository.ICategoryRepository;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category save(Category category)  {return categoryRepository.save(category);}


    @Override
    public void delete(Long id) {categoryRepository.deleteById(id);}

}
