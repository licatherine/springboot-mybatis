package com.rebecca.bean;

/**
 * Created by catherine on 2017/4/17.
 */
public class Demo {
    private long property_id;
    private String property_name;
    private String property_value;
    private long category_id;

    public long getProperty_id() {
        return property_id;
    }

    public String getProperty_name() {
        return property_name;
    }

    public String getProperty_value() {
        return property_value;
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setProperty_id(long property_id) {
        this.property_id = property_id;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public void setProperty_value(String property_value) {
        this.property_value = property_value;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

}