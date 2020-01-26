package com.sda.twetter.service;

import com.sda.twetter.persistance.dao.ArticleDao;
import com.sda.twetter.persistance.entities.TbUser;

import java.util.List;

public class ArticleService {

    private ArticleDao articleDao = new ArticleDao();

    public List getArticles() {
        return articleDao.getArticles();
    }

    public void addArticle(TbUser tbUser, String content) {
        articleDao.addArticle(tbUser, content);
    }
}
