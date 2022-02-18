package net.atos.controller;

import net.atos.model.User;
import net.atos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authentication")
@CrossOrigin
public class AuthenticationController {
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("")
    public String SignIn() {
        return "sign_in";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("/checklogin")
    public Boolean addUser(@RequestBody User user) {
        return false;
    }
}
