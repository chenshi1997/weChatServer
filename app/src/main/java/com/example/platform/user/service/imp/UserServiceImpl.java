package com.example.platform.user.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.platform.user.mapper.UserMapper;
import com.example.platform.user.model.User;
import com.example.platform.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void insert(User user) {
        userMapper.insert(user);
        List list= userMapper.selectList(null);
        System.err.println(list.toString());
    }
}
