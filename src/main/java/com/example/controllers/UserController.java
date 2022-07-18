package com.example.controllers;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    /*
    Просто контроллер который отвечает за пользователя
    */

    @Autowired
    private UserService service;

    /*
    INSERT INTO "user" VALUES (1, '2', '3'); - в бд добавить пример
    http://localhost:8080/demo/user - показывает json-ом, все юзеры из бд (список)
    */

    @GetMapping
    public List<User> findAll() {
        return service.getAllUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody User resource) {
        if(resource == null){
            return;
        }
        service.addUser(resource);
    }

    /*
    http://localhost:8080/demo/user/1 - удаляет из бд юзера с id - 1
    */
    @GetMapping("/{id}")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

}
