package com.driver.services;

import com.driver.model.User;
import io.swagger.models.auth.In;

public interface UserService {
    User register(String username,String password,String countryName) throws Exception;

    public User subscribe(Integer userId, Integer serviceProviderId);
}