package cn.smileyan.demo.service;

import cn.smileyan.demo.entity.TestUser;

/**
 * @author smileyan
 */
public interface UserService {
    /**
     * 根据id查询User
     * @param userId
     * @return user
     */
    TestUser getUserById(Integer userId);
}
