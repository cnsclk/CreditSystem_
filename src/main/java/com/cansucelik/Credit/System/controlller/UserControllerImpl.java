package com.cansucelik.Credit.System.controlller;

import com.cansucelik.Credit.System.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;
}
