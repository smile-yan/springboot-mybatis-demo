package cn.smileyan.demo.controller;

import cn.smileyan.demo.entity.TestUser;
import cn.smileyan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author smileyan
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    private Map<String,Object> findUserById(Integer userId){
        Map<String,Object> modelMap=new HashMap<>();
        TestUser user = userService.getUserById(userId);
        modelMap.put("user",user);
        return modelMap;
    }

    @GetMapping("/")
    private String index(){
        return "hello world";
    }


}
