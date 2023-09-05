package ss4.bt.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ss4.bt.model.entity.Post;


@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {
    Iterable<Post> findAllByCategoryId(Long catId);

}
