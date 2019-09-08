package cn.plasticlove.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author luka-seu
 * @description
 * @create 2019-09 07-22:54
 **/
@Data
@ToString
public class Color implements InitializingBean, DisposableBean {
    private String name;
    public void print(String name){
        System.out.println(name);
    }
    public Color(){
        System.out.println("这是Bean生命周期的construct-method");
    }
    /**
     * 指定初始化方法init-method和destroy-method的方式（Bean初始化和销毁的方式）
     *
     * 1.xml的bean标签配置
     * 2.bean实现InitializingBean和DisposableBean
     * 3.方法上注释@PostConstruct和@PreDestroy
     */

    public void init(){
        System.out.println("这是Bean生命周期的init-method");
    }

    //在实例化后的对bean的初始化方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("这是Bean生命周期的InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("这是Bean生命周期的DisposableBean");
    }
}
