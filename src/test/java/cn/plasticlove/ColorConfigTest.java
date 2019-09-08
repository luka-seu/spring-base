package cn.plasticlove;


import cn.plasticlove.config.ColorConfig;
import cn.plasticlove.config.ColorConfig2;
import cn.plasticlove.config.ColorFactoryBean;
import cn.plasticlove.entity.Color;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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

@Component
public class ColorConfigTest {
    @Autowired
    private ColorFactoryBean colorFactoryBean;
    @Test
    public void testColor(){
        //AnnotationConfigApplicationContext和ClassPathXmlApplicationContext都是applicationContext的具体实现。都实现了BeanFactory接口
        ApplicationContext context =  new AnnotationConfigApplicationContext(ColorConfig.class);
        /**
         * Bean的生命周期
         */
        /**
         * 通过factoryBean的方式获取的Beam是方法getObject()方法得到的。
         */
        Color color = (Color) context.getBean("colorFactoryBean");
        color.print("color");

    }
    @Test
    public void testColor2(){
        //AnnotationConfigApplicationContext和ClassPathXmlApplicationContext都是applicationContext的具体实现。都实现了BeanFactory接口
        ApplicationContext context =  new AnnotationConfigApplicationContext(ColorConfig2.class);
        //@Import的方式需要用byType的方式获取bean
        Color color = (Color) context.getBean(Color.class);
        color.print("color");

    }
    @Test
    public void testColor3() throws Exception {
        ApplicationContext context =  new AnnotationConfigApplicationContext(ColorConfig.class);
        String[] beans = context.getBeanDefinitionNames();
        for (String bean : beans){
            System.out.println(bean);
        }
    }

}