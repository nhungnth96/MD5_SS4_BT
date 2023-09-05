package ss4.bt.model.service.post;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ss4.bt.model.entity.Category;
import ss4.bt.model.entity.Post;
import ss4.bt.model.repository.IPostRepository;


import java.util.Optional;


@Service
public class PostService implements IPostService {
    @Autowired
    private IPostRepository postRepository;

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }


    public Iterable<Post> findAllByCat(Long catId) {
       return postRepository.findAllByCategoryId(catId);
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Post save(Post post)  {return postRepository.save(post);}


    @Override
    public void delete(Long id) {postRepository.deleteById(id);}
}
