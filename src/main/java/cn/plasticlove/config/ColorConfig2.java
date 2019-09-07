package cn.plasticlove.config;

import cn.plasticlove.entity.Color;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author luka-seu
 * @description 通过Import注入Bean
 * @create 2019-09 07-23:52
 **/
@Configuration
@Import(value = {Color.class})
public class ColorConfig2 {
}
