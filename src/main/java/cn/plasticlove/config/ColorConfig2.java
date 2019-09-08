package cn.plasticlove.config;

import cn.plasticlove.entity.Color;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author luka-seu
 * @description 通过Import注入Bean
 * @create 2019-09 07-23:52
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

@Configuration
@Import(value = {Color.class})
public class ColorConfig2 {
}
