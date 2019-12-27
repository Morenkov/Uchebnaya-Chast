package com.uchchast.stats.controller.rest;

import com.uchchast.stats.entity.dto.UserDataTransferObject;
import com.uchchast.stats.exceptions.FailAddingUserException;
import com.uchchast.stats.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexRestController {

    private final UserService userService;

    @Autowired
    public IndexRestController(UserService userService){
        this.userService = userService;
    }

    @ResponseStatus
    @PutMapping("/registration")
    public UserDataTransferObject registration(@RequestBody UserDataTransferObject userDTO) throws FailAddingUserException {
        if (userService.addAUser(userDTO) == null){
            throw new FailAddingUserException();
        }
        return userDTO;
    }

    @GetMapping("/loginCheck/{login}")
    public String loginEqualsCheck(@PathVariable String login){
        if (userService.checkEqualsLogin(login)){
            return login;
        }
        else {
            return "fail";
        }
    }

}