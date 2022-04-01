package com.ever.everblog.service.impl;

import com.ever.everblog.dao.SystemUserDao;
import com.ever.everblog.entity.SystemUser;
import com.ever.everblog.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

  @Resource
  private SystemUserDao systemUserDao;

  @Override
  public List<SystemUser> getUserList() {
    List<SystemUser> systemUserList = systemUserDao.findAll();
    return systemUserList;
  }
  /**
   * 执行密码加密
   * @param password 原始密码
   * @param salt 盐值
   * @return 加密后的密文
   */
  private String getMd5Password(String password, String salt) {
    /*
     * 加密规则：
     * 1、无视原始密码的强度
     * 2、使用UUID作为盐值，在原始密码的左右两侧拼接
     * 3、循环加密3次
     */
    for (int i = 0; i < 3; i++) {
      password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();
    }
    return password;
  }

  /**
   * 自动生成token
   * @return 加密后的密文
   */
  private String getToken(){
    String salt = UUID.randomUUID().toString().toUpperCase();
    return salt;
  }
}
