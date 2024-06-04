package com.anucodes.blogapp.controller;

import com.anucodes.blogapp.dto.BlogDto;
import com.anucodes.blogapp.entity.Blog;
import com.anucodes.blogapp.services.Blogs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog/")
public class HomeController {

    private final Blogs blogs;

    public HomeController(Blogs blogs) {
        this.blogs = blogs;
    }

    @GetMapping("all/")
    public ResponseEntity<List<Blog>> all() {
        return new ResponseEntity<>(blogs.getAllBlogs(), HttpStatus.OK);
    }

    @PostMapping("add/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Blog> add(@RequestBody BlogDto blogDto) {
        return new ResponseEntity<>(blogs.addBlog(blogDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}/")
    public ResponseEntity<Blog> get(@PathVariable int id){
        return new ResponseEntity<>(blogs.getBlogById(id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}/")
    public ResponseEntity<String> deleteBlog(@PathVariable int id){
        blogs.deleteBlogById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }
}
