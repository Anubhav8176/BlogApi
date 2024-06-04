package com.anucodes.blogapp.repository;

import com.anucodes.blogapp.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
