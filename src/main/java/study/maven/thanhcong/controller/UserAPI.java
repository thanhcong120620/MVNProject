package study.maven.thanhcong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.maven.thanhcong.model.entity.User.User;
import study.maven.thanhcong.service.IUserService;

@RestController
@RequestMapping("/api")
public class UserAPI {

    @Autowired
    private IUserService userService;


    @GetMapping
    public ResponseEntity<String> HelloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User userI){

        User userO = userService.saveAndUpdate(userI);

        return ResponseEntity.ok(userO);
    }
}
