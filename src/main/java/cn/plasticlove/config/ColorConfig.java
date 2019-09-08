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

/**
 * 给容器中注入bean的三种方式
 *
 * 1.xml配置
 * 2.@注解
 *      1)传统的@component
 *      2)@Configuration+@Bean
 *      3)@Import
 * 3.FactoryBean工厂bean注入
 */



//@Configuration 表示这是一个配置类
@Configuration
//@ComponentScan(value = "cn.plasticlove.config")
public class ColorConfig {
    //@Beam就是定义一个bean
//    @Bean(name = "color",initMethod = "init",destroyMethod = "destroy")
//    public Color color(){
//        return new Color();
//    }

    @Bean(name = "color2")
    public Color color2(){
        return new Color();
    }

//    @Bean
//    public ColorFactoryBean colorFactoryBean(){
//        return new ColorFactoryBean();
//    }


}
