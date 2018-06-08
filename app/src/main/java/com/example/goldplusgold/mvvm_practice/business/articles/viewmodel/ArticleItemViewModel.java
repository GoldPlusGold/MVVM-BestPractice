package com.example.goldplusgold.mvvm_practice.business.articles.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

import com.example.goldplusgold.mvvm_practice.business.articles.model.Article;

import java.io.Serializable;

public class ArticleItemViewModel extends BaseObservable implements Serializable {

    public ObservableField<String> imageUrl = new ObservableField<>();

    public ObservableField<String> title = new ObservableField<>();

    private ArticlesViewModel.ArticleEditor mEditor;

    public void setArticle(Article article) {
        imageUrl.set(article.getImageUrl());
        title.set(article.getTitle());
    }

    public void setEditor(ArticlesViewModel.ArticleEditor editor) {
        mEditor = editor;
    }

    public void onArticleClick() {
        mEditor.editArticle(this);
    }
}
