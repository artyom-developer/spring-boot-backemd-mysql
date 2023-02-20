package com.tutofox.demomysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutofox.demomysql.dao.PersonDao;
import com.tutofox.demomysql.entity.Person;

import jakarta.transaction.Transactional;

@Service
public class PersonServiceImplement implements PersonService {
	
	@Autowired
	private PersonDao personDao;

	@Override
	@Transactional
	public List<Person> findAll() {
		return (List<Person>) personDao.findAll();
	}

	@Override
	@Transactional
	public Person save(Person person) {
		// TODO Auto-generated method stub
		return personDao.save(person);
	}

	@Override
	@Transactional
	public Person findById(Long id) {
		return personDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Person person) {
		personDao.delete(person);
	}

}
