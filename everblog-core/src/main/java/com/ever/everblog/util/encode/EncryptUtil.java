package com.ever.everblog.util.encode;

import org.springframework.util.DigestUtils;

import java.util.UUID;

public class EncryptUtil {

    /**
     * 执行密码加密
     *
     * @param password 原始密码
     * @param token    密钥
     * @return 加密后的密文
     */
    private String getMd5Password(String password, String token) {
        /*
         * 加密规则：
         * 1、无视原始密码的强度
         * 2、使用UUID作为token，在原始密码的左右两侧
         * 3、循环加密3次
         */
        for (int i = 0; i < 3; i++) {
            password = DigestUtils.md5DigestAsHex((token + password + token).getBytes()).toUpperCase();
        }
        return password;
    }

    /**
     * 生成token
     *
     * @return 随机生成的token
     */
    private String getToken() {
        String token = UUID.randomUUID().toString().toUpperCase();
        return token;
    }
}
