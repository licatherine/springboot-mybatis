package com.rebecca.mapper;

import com.rebecca.bean.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: catherine
 * Date: 2017/4/24
 * Time: 17:30
 * To change this template use File | Settings | File Templates.
 */
@Mapper
public interface PersonMapper {

   /* @Insert("insert into tmp_person(id,name,age,sex) values(#{id},#{name},#{age},#{sex})")*/
     void insertPerson (Person person);

   /* @Update("UPDATE tmp_person SET name=#{name},address=#{address} WHERE id =#{id}")*/
    void  updatePerson(Person person);

  /*  @Delete("DELETE FROM tmp_person WHERE id =#{id}")*/
    void  deletePerson(Long id);

    List<Person> selectPersons();

}
