package com.eurekaProvider.eurekaProvider.mapper;

import com.eurekaProvider.eurekaProvider.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

   @Select("SELECT *   FROM user")
    List<User> getAll();
}
