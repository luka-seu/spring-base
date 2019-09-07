package cn.plasticlove.config;

import cn.plasticlove.entity.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author luka-seu
 * @description color类， @Bean注入
 * @create 2019-09 07-22:29
 **/




//@Configuration 表示这是一个配置类
@Configuration
@ComponentScan(value = "cn.plasticlove.config")
public class ColorConfig {
    //@Beam就是定义一个bean
    @Bean
    public Color color(){
        return new Color();
    }

//    @Bean
//    public ColorFactoryBean colorFactoryBean(){
//        return new ColorFactoryBean();
//    }


}
