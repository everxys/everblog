package com.ever.everblog.core.dao;

import com.ever.everblog.core.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserDao extends JpaRepository<SystemUser,Integer> {
}
