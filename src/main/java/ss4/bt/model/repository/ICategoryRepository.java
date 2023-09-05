package ss4.bt.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ss4.bt.model.entity.Category;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Long> {

}
