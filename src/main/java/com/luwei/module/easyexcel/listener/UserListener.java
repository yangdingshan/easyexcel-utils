package com.luwei.module.easyexcel.listener;

import com.luwei.module.easyexcel.pojo.User;
import com.luwei.module.easyexcel.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author WuKun
 * @since 2019/10/10
 */
@Slf4j
@AllArgsConstructor
public class UserListener extends BaseExcelListener<User> {

    private UserService userService;

    @Override
    void saveData() {
        userService.saveBatchUser(getData());
        log.info("/*------- 写入数据 -------*/");
    }
}