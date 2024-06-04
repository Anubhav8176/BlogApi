package com.anucodes.blogapp.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BlogDto {
    private String title;
    private String content;
}
