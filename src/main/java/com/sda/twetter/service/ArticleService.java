package com.sda.twetter.service;

import com.sda.twetter.persistance.dao.ArticleDao;

import java.util.List;

public class ArticleService {

    private ArticleDao articleDao = new ArticleDao();

    public List getArticles() {
        return articleDao.getArticles();
    }
}
