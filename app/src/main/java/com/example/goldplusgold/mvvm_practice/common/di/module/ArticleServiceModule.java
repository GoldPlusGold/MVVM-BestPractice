package com.example.goldplusgold.mvvm_practice.common.di.module;

import com.example.goldplusgold.mvvm_practice.business.articles.service.ArticleService;
import com.example.goldplusgold.mvvm_practice.common.retrofit.RetrofitProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class ArticleServiceModule {

    @Provides
    ArticleService provideArticleService() {
        return RetrofitProvider.getInstance().create(ArticleService.class);
    }

}
