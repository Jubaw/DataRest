package com.jubaw.controller;


import com.jubaw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // http:/localhost:8080/users
public class UserController {

    /*
        DATA-REST den dolayi calisan CRUD endpointleri
        1) getAll   --> http://localhost:8080/users + GET
        2) getById  --> http://localhost:8080/users/{id} + GET
        3) create   --> http://localhost:8080/users + POST
        4) Update   --> http://localhost:8080/users/{id} + PUT
        5) Delete   --> http://localhost:8080/users/{id} + DELETE

        NOT : hazir kullanimlarda DTO siniflari kullanilamiyor
 */



    @Autowired
    private UserService userService;
}
