package com.myersbriggs.dao;

import com.myersbriggs.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
*
*/
@Component
public class MyersBriggsDAOImpl implements MyersBriggsDAO {

    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void savePerson(Person person) {
        hibernateTemplate.saveOrUpdate(person);
    }

}
