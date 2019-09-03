package cn.plasticlove.service;

import cn.plasticlove.dao.UserMapper;
import cn.plasticlove.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luka-seu
 * @description
 * @create 2019/9/3-17:16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void insert() {
        User user = new User();
        user.setUsername("adddd");
        user.setPassword("122223");
        userMapper.insert(user);
    }
}
