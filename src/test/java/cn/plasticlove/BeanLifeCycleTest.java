package cn.plasticlove;

import cn.plasticlove.config.ColorConfig;
import cn.plasticlove.config.UserConfig;
import cn.plasticlove.entity.Color;
import org.junit.Test;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author luka-seu
 * @description bean的生命周期测试
 * @create 2019-09 08-21:08
 **/


/**
 * Bean的生命周期
 * 1. 调用构造方法实例化
 * 2. 依赖注入（DI）注入属性值
 * 3. BeanPostProcessor初始化前置处理
 * 4. 调用init-method初始化
 * 5. BeanPostProcessor初始化后置处理
 * 6. 使用中
 * 7. Disposable 销毁前处理
 * 8. 销毁
 */

public class BeanLifeCycleTest {
    //基于init-method和destroy-method

    /**
     * 基于xml配置的初始化方法和配置方法
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Color color = (Color) applicationContext.getBean("color");
        applicationContext.close();
    }


    /**
     * 基于@Bean配置的初始化方法和配置方法
     */
    @Test
    public void test2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ColorConfig.class);
//        Color color = (Color) applicationContext.getBean("color");
        applicationContext.close();
    }


    //基于InitializingBean和DisposableBean
    @Test
    public void test3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ColorConfig.class);
//        Color color = (Color) applicationContext.getBean("color");
        applicationContext.close();
    }


    //基于PostConstruct和PreDestroy
    @Test
    public void test4() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
//        Color color = (Color) applicationContext.getBean("color");
        applicationContext.close();
    }



}
