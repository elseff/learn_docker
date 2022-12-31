package com.elseff.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MainController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome!";
    }

    @GetMapping
    public List<User> getAll(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public User getSpecific(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return repository.save(user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") User user){
        repository.delete(user);
    }
}
