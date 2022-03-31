package com.ever.everblog.web;

import com.ever.everblog.core.dao.SystemUserDao;
import com.ever.everblog.core.entity.SystemUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemUserDaoTest {

  @Resource
  private SystemUserDao systemUserDao;

  @Resource
  private EntityManager entityManager;

  @Test
  public void testFindAll(){
    List<SystemUser> systemUserList = systemUserDao.findAll();
    systemUserList.forEach(System.out::println);
  }

  @Test
  @Transactional
  @Rollback(value = false)
  public void testEntityManager(){
    Query nativeQuery = entityManager.createNativeQuery("update system_user set password=123456 where username='admin';");
    int i = nativeQuery.executeUpdate();
    System.out.println(i);
  }

}
