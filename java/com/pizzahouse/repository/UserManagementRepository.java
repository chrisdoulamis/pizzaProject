/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzahouse.repository;

import com.pizzahouse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author stargazer
 */
public interface UserManagementRepository  extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    User findById(Long id);

    @Modifying
    @Transactional
    void deleteById(Long id);

    
}
