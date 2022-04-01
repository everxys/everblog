package com.ever.everblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="system_user")
public class SystemUser {

  @Id
  @GeneratedValue
  private String userId;

  private String username;

  private String password;


}
