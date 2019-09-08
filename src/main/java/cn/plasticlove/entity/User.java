package cn.plasticlove.entity;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author luka-seu
 * @description user 实体类
 * @create 2019/9/3-17:15
 */
@Data
public class User {
    private String username;
    private String password;
    @PostConstruct
    public void inti(){
        System.out.println("这是PostConstruct");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy");
    }
}
