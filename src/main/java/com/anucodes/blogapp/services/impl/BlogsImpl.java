package com.anucodes.blogapp.services.impl;

import com.anucodes.blogapp.dto.BlogDto;
import com.anucodes.blogapp.entity.Blog;
import com.anucodes.blogapp.repository.BlogRepository;
import com.anucodes.blogapp.services.Blogs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogsImpl implements Blogs {

    private final BlogRepository blogRepository;

    public BlogsImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(int id) {
        return blogRepository.getReferenceById(id);
    }

    @Override
    public void deleteBlogById(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog addBlog(BlogDto blogDto) {
        Blog blog = new Blog();
        blog.setTitle(blogDto.getTitle());
        blog.setContent(blogDto.getContent());
        return blogRepository.save(blog);
    }
}
