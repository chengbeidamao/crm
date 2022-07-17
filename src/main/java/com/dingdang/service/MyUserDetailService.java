package com.dingdang.service;

import com.dingdang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        com.dingdang.pojo.User user = userMapper.selectUser(username);

        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }


        List<GrantedAuthority> list = AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
        return  new User(user.getUserName(),new BCryptPasswordEncoder().encode(user.getPassWord()),list);
    }
}