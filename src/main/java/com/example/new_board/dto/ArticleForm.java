package com.example.new_board.dto;

import com.example.new_board.entity.Article;
import io.micrometer.observation.ObservationFilter;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }
}