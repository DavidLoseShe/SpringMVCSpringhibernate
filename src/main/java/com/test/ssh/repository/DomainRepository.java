package com.test.ssh.repository;

import java.io.Serializable;

/**
 * Created by guhao on 2017/8/21.
 */
public interface DomainRepository<T,PK extends Serializable>{


    PK save(T entity);


}
