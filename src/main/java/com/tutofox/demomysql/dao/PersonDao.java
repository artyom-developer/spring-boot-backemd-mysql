package com.tutofox.demomysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutofox.demomysql.entity.Person;

@Repository 
public interface PersonDao extends JpaRepository<Person, Long> {

}
