package cn.smileyan.demo.dao;

import cn.smileyan.demo.entity.TestUser;

/**
 * @author smileyan
 */
public interface UserDao {

    /**
     * 根据id查询user
     * @param user_id
     * @return TestUser
     */
    TestUser getUserById(Integer user_id);
}
