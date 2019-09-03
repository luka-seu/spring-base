package cn.plasticlove;

import cn.plasticlove.service.TeacherService;
import cn.plasticlove.service.UserService;
import lombok.experimental.PackagePrivate;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author luka-seu
 * @description
 * @create 2019/9/3-17:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-dao.xml")
public class Test {
    @Autowired
    private UserService userService;
    @Autowired
    private TeacherService teacherService;

    @org.junit.Test
    public void test(){
        userService.insert();
    }
    @org.junit.Test
    public void test1(){
        teacherService.insertTeacher();
    }
}
