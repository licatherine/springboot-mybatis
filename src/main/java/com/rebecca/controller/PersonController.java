package com.rebecca.controller;

import com.rebecca.bean.Person;
import com.rebecca.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: catherine
 * Date: 2017/4/24
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value="/insert")
    public void insert(int id,String name,int age,String sex){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        person.setSex(sex);
        personService.insertPerson(person);
    }

    @RequestMapping(value="/update")
    public void update(int id,String name,String address){
        Person person =  new Person();
        person.setId(id);
        person.setName(name);
        person.setAddress(address);
        personService.updatePerson(person);
    }

    @RequestMapping(value="/delete")
    public void delete(int id){
        personService.deletePerson(id);
    }

    @RequestMapping(value="/selectPersons")
    public List<Person> selectPersons(){
        List<Person> personList = new ArrayList<>();
        personList = personService.selectPersons();
        return personList;
    }
}
