package com.example.new_board.repository;

import com.example.new_board.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Override
    ArrayList<Article> findAll();
}
