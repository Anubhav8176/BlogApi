package com.anucodes.blogapp.services;

import com.anucodes.blogapp.dto.BlogDto;
import com.anucodes.blogapp.entity.Blog;

import java.util.List;

public interface Blogs {
    List<Blog> getAllBlogs();
    Blog getBlogById(int id);
    void deleteBlogById(int id);
    Blog addBlog(BlogDto blog);
}
