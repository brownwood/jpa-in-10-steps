/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globalsoft.learning.jpa.jpain10steps;

import com.globalsoft.learning.jpa.jpain10steps.entity.User;
import com.globalsoft.learning.jpa.jpain10steps.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author adebowale.odulaja
 */
@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
    
    private static final Logger log = LoggerFactory.getLogger((UserDAOServiceCommandLineRunner.class));
    
    @Autowired
    private UserDAOService UserDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long insert = UserDAOService.insert(user);
        log.info("New user created: "+ user);
    }
    
}
