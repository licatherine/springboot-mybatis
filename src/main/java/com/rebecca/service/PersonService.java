package com.rebecca.service;

import com.rebecca.bean.Person;
import com.rebecca.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: catherine
 * Date: 2017/4/24
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public void insertPerson(Person person){
         personMapper.insertPerson(person);
    }

    public void updatePerson(Person person){
        personMapper.updatePerson(person);
    }

    public void deletePerson(long id){
        personMapper.deletePerson(id);
    }

    public List<Person> selectPersons() {
        return personMapper.selectPersons();
    }
}
