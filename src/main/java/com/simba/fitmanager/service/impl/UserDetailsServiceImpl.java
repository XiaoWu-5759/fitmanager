package com.simba.fitmanager.service.impl;

import com.simba.fitmanager.dao.JwtUser;
import com.simba.fitmanager.dao.User;
import com.simba.fitmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(s);
        // 接口方法需要返回一个UserDetails类型的接口，所以这边就再写一个类去实现一下这个接口。
        return new JwtUser(user);

    }
}
