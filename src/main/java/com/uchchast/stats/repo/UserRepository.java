package com.uchchast.stats.repo;


import com.uchchast.stats.entity.dto.UserDataTransferObject;
import com.uchchast.stats.entity.entities.UserEntity;

public interface UserRepository<P extends UserDataTransferObject>{

    void addAUser(P p);

    boolean checkEqualsLogin(P p);

    UserEntity findByLogin(String login);

    String getRoleByCred(String login, String password);
}
