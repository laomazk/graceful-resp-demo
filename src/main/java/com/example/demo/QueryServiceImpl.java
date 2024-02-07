package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class QueryServiceImpl implements QueryService {


    public UserInfoView queryOne() {

        //这里直接抛自定义异常
        throw new NotFoundException();
    }
}