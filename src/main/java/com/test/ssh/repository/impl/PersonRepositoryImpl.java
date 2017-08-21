package com.test.ssh.repository.impl;

import com.test.ssh.entity.Person;
import com.test.ssh.repository.PersonRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by guhao on 2017/8/21.
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }


    public Long save(Person entity) {
        Session session=getCurrentSession();
        session.save(entity);
        Long a=null;
        return a;
    }



    }
