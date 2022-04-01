package com.ever.everblog.service.impl;

import com.ever.everblog.dao.SystemUserDao;
import com.ever.everblog.entity.SystemUser;
import com.ever.everblog.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Resource
  private SystemUserDao systemUserDao;

  @Override
  public List<SystemUser> getUserList() {
    List<SystemUser> systemUserList = systemUserDao.findAll();
    return systemUserList;
  }
}
