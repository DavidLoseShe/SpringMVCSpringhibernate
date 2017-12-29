package com.test.ssh.service.impl;

import com.test.ssh.entity.Person;
import com.test.ssh.repository.PersonRepository;
import com.test.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by guhao on 2017/8/21.
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Long savePerson() {
        Person person = new Person();
        person.setUsername("XRog");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is XRog");System.out.print("8888888888888888888888");
        return personRepository.save(person);
    }
}