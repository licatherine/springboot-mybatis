package com.rebecca.mapper;

import com.rebecca.bean.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by catherine on 2017/4/17.
 */
@Mapper
public interface DemoMapper {
    @Select("select * from cis_dict where property_name like '%'||#{name}||'%'")
    public abstract List<Demo> likeName(@Param("name") String name);

    @Select("select * from cis_dict where property_id=#{id}")
    public abstract Demo getProperty_id(long id);

    @Select("select * from cis_dict where property_name=#{name}")
    public abstract Demo getProperty_name(String name);
}
