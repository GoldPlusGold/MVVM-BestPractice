package com.example.goldplusgold.mvvm_practice.common.di.component;

import com.example.goldplusgold.mvvm_practice.common.di.module.ArticleServiceModule;
import com.example.goldplusgold.mvvm_practice.business.articles.viewmodel.ArticlesViewModel;

import dagger.Component;

@Component(modules = ArticleServiceModule.class)
public interface ArticleServiceComponent {

    void inject(ArticlesViewModel articlesViewModel);


}
