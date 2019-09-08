package cn.plasticlove.config;

import cn.plasticlove.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luka-seu
 * @description
 * @create 2019-09 08-21:31
 **/
@Configuration
public class UserConfig {
    @Bean
    public User user(){
        return new User();
    }
}
