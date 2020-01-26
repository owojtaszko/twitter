package com.sda.twetter.persistance.dao;

import com.sda.twetter.persistance.HibernateUtil;
import com.sda.twetter.persistance.entities.TbArticle;
import com.sda.twetter.persistance.entities.TbUser;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ArticleDao {

    public void addArticle(TbUser tbUser, String content) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            TbArticle tbArticle = new TbArticle();
            tbArticle.setUser(tbUser);
            tbArticle.setContent(content);

            session.save(tbArticle);
            session.getTransaction().commit();
        }
    }

    public List getArticles() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            final Query query = session.createQuery("select o from TbArticle o");
            session.getTransaction().commit();
            return query.getResultList();
        }
    }
}
