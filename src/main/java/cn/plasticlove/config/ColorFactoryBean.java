package cn.plasticlove.config;

import cn.plasticlove.entity.Color;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author luka-seu
 * @description 通过FacrtoryBean的方式注入工厂类
 * @create 2019-09 08-00:20
 **/
@Component
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    /**
     * 控制是否是单例模式
     */
    public boolean isSingleton() {
        return true;
    }
}
