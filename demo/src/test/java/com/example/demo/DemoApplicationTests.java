package com.example.demo;

import com.dao.bean.User;
import com.dao.mapper.TestMapper;
import com.dao.service.OperatorUserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(locations= {})
@ComponentScan(basePackages = {"com"})
@MapperScan(basePackages = {"com.dao.mapper"})
class DemoApplicationTests {

    @Autowired
    TestMapper mapper;

    @Autowired
    OperatorUserService operatorUserService;
    @Test
    void contextLoads() {
        User test = new User();

        String pre = "COMMON";
        test.setMemo("萨达萨达");
        test.setUserCode("asfasfs");
        test.setUserCount("asfasfasd");
        test.setUserEmail("asfasfsafasf");
        test.setUserName("Asfasfsfs");
        test.setUserPass("asfassdfsdfsdf");
        test.setUserPro("asfasf");
        test.setUserLove("asfasfsf");


        operatorUserService.insertUser(test , pre);
    }

}
