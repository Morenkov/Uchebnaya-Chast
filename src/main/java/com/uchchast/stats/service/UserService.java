package com.uchchast.stats.service;


import com.uchchast.stats.entity.dto.UserDataTransferObject;

public interface UserService {

    UserDataTransferObject addAUser(UserDataTransferObject userDTO);

    boolean checkEqualsLogin(String login);

    String getRoleByLoginAndPassword(String login, String password);
}
