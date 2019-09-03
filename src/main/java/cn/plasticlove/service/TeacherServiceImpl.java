package cn.plasticlove.service;

import cn.plasticlove.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luka-seu
 * @description
 * @create 2019/9/3-17:17
 */
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private UserService userService;



    @Override

    /**@Transactional(propagation = Propagation.REQUIRED)
     * REQUIRED:支持当前事务，当前没有事务，就新建事务运行；有事务就在当前事务中运行
     */

    /**
     * @Transactional(propagation = Propagation.SUPPORTS)
     * SUPPORTS:支持当前事务，如果没有事务，则以非事务运行
     */

    /**
     * @Transactional(propagation = Propagation.MANDATORY)
     * MANDATORY:必须以事务运行，如果当前方法不存在事务，抛异常
     */


    /**
     * @Transactional(propagation = Propagation.REQUIRED_NEW)
     * REQUIRED_NEW:总是新建事务运行，如果当前存在事务，将当前事务挂起（内层和外层事务互不影响）
     */

    /**
     * @Transactional(propagation = Propagation.NOT_SUPPORTS)
     * NOT_SUPPORTS:总是不以事务运行，如果当前存在事务，将当前事务挂起
     */

    /**
     * @Transactional(propagation = Propagation.NEVER)
     * NEVER:总是不以事务运行，如果当前存在事务，抛异常
     */

    /**
     * @Transactional(propagation = Propagation.NESTED)
     * NESTED:当前存在事务，嵌套事务；不存在事务，按照REQUIRED传播机制处理（内层外层事务嵌套关系）
     */
    public void insertTeacher() {
        userService.insert();
    }
}
