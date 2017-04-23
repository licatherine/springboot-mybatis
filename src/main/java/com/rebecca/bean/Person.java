package com.rebecca.bean;

/**
 * Created with IntelliJ IDEA.
 * User: catherine
 * Date: 2017/4/21
 * Time: 12:46
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    public int id;
    public int age;
    public String name;
    public String sex;
    public String address;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
