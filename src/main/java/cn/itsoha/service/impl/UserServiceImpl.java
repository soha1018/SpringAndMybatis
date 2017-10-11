package cn.itsoha.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itsoha.IDao.UserMapper;
import cn.itsoha.domain.User;
import cn.itsoha.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {

	 @Resource  
	 private UserMapper userDao;  
	 
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);  
	}

}
