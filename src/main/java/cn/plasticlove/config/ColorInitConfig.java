package cn.plasticlove.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author luka-seu
 * @description 基于InitializingBean和DisposableBean
 * @create 2019-09 08-21:21
 **/

public class ColorInitConfig implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {

    }

    /**
     * 在实例化后的对bean的初始化方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("这是Bean");
    }
}
