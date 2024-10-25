package com.bank.system.Bank_System_Kanchana.controller;

import com.bank.system.Bank_System_Kanchana.dto.BankResponse;
import com.bank.system.Bank_System_Kanchana.dto.UserRequest;
import com.bank.system.Bank_System_Kanchana.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")

public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }

}
