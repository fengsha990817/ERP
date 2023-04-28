package com.example.backend;

import com.example.backend.entity.TableReturnEntity;
import com.example.backend.mapper.TableEntityMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123456"));
    }

    @Resource
    TableEntityMapper mapper;

    @Test
    void queryTest(){
        TableReturnEntity entityByPageNumber = mapper.findEntityByPageNumber("ABCD-DDDD-F34");
        System.out.println(entityByPageNumber);
    }

}
