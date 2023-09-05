package ss4.bt.model.service.post;



import ss4.bt.model.entity.Post;
import ss4.bt.model.service.IGenericService;

public interface IPostService extends IGenericService<Post,Long> {
    Iterable<Post> findAllByCat(Long catId);
}
