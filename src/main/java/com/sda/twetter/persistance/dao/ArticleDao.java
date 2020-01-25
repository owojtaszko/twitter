package com.sda.twetter.persistance.dao;

import com.sda.twetter.persistance.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ArticleDao {

    public List getArticles() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            final Query query = session.createQuery("select o from TbArticle o");
            session.getTransaction().commit();
            return query.getResultList();
        }
    }
}
