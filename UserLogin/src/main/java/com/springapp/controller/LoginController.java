package com.springapp.controller;

import com.springapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sivaraj on 12/6/16.
 */
@Controller
@RequestMapping("/UserLogin")
public class LoginController {
    @RequestMapping(value = {"LoginForm"}, method = RequestMethod.GET)
    public String loginForm(User user) {
        user.setLoginName("");
        user.setPassword("");
        return "LoginForm";
    }
    @RequestMapping(value = {"Login"}, method = RequestMethod.GET)
    public String login(User user) {
        user.setLoginName("");
        user.setPassword("");
        return "LoginForm";
    }
}
