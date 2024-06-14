package com.krishna.joblisting;

import com.krishna.joblisting.model.Post;
import com.krishna.joblisting.repository.PostRepository;
import com.krishna.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post) {

        return repo.save(post);
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }
}

