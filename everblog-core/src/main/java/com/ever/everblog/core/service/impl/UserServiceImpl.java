package com.ever.everblog.core.service.impl;

import com.ever.everblog.core.dao.SystemUserDao;
import com.ever.everblog.core.entity.SystemUser;
import com.ever.everblog.core.service.UserService;
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
