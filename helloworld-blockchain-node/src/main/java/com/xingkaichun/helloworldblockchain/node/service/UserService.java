package com.xingkaichun.helloworldblockchain.node.service;

import com.xingkaichun.helloworldblockchain.node.dto.user.UserDto;

/**
 * 用户service
 *
 * @author 邢开春 xingkaichun@qq.com
 */
public interface UserService {


    long queryUserSize();
    UserDto queryUserByUserName(String userName);
    void addUser(UserDto userDto);
    void updateUser(UserDto userDto);
}
