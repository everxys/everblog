package com.ever.everblog.dao;

import com.ever.everblog.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserDao extends JpaRepository<SystemUser,Integer> {
}
