package cn.smileyan.demo.service.impl;

import cn.smileyan.demo.dao.UserDao;
import cn.smileyan.demo.entity.TestUser;
import cn.smileyan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author smileyan
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public TestUser getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
