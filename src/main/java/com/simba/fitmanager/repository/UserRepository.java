package com.simba.fitmanager.repository;

import com.simba.fitmanager.dao.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>{
    User findByUserName(String username);

}
