package com.ever.everblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SuppressWarnings("SpringComponentScan")
@EntityScan(basePackages = "${everblog.info.base-package}.core.entity")
@EnableJpaRepositories(basePackages = "${everblog.info.base-package}.core.dao")
@SpringBootApplication(scanBasePackages = {"${everblog.info.base-package}.web","${everblog.info.base-package}.core"})
public class BlogApplication {
  public static void main(String[] args) {
    SpringApplication.run(BlogApplication.class, args);
  }
}
