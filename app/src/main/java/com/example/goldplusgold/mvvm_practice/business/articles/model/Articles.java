package com.example.goldplusgold.mvvm_practice.business.articles.model;

import java.io.Serializable;
import java.util.List;

public class Articles implements Serializable {

    List<Article> articleList;

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}
