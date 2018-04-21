/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globalsoft.learning.jpa.jpain10steps.service;

import com.globalsoft.learning.jpa.jpain10steps.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adebowale.odulaja
 */

@Repository
@Transactional //Open and Close transaction during persistence activity.
public class UserDAOService {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}
