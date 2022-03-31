package com.ever.everblog.web.controller;

import com.ever.everblog.core.entity.SystemUser;
import com.ever.everblog.core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

  @Resource
  private UserService userService;

  @GetMapping("/getUserList")
  @ResponseBody
  public List<SystemUser> getUserList(){
    List<SystemUser> userList = userService.getUserList();
    return userList;
  }

}
