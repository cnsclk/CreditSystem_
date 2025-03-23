package com.cansucelik.Credit.System.service;

import com.cansucelik.Credit.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
}
