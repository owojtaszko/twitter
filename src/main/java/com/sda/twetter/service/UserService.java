package com.sda.twetter.service;

import com.sda.twetter.exception.ImproperLoginCredentials;
import com.sda.twetter.persistance.dao.UserDao;
import com.sda.twetter.persistance.entities.TbUser;

public class UserService {
    private UserDao userDao = new UserDao();

    public TbUser getUserByUserName(String userName, String password) throws ImproperLoginCredentials {
        TbUser userByLogin = userDao.getUserByLogin(userName);
        if (userByLogin == null || !userByLogin.getPassword().equals(password)) {
            throw new ImproperLoginCredentials("password or username does not match");
        }
        return userByLogin;
    }
}
