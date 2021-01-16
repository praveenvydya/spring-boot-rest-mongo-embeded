package com.portal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.portal.model.User;
import com.portal.repository.UserRepository;

@Service
public class UserService extends AbstractService<User, Long> {

    @Autowired
    private UserRepository userRepository;

    @Override
    protected MongoRepository<User, Long> getRepository() {
        return userRepository;
    }

}
