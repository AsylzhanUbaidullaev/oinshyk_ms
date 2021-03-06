//package com.example.gateway.controller;
//
//
//import com.example.gateway.model.User;
//import com.example.gateway.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(value = "/users")
//public class UserController {
//  @Autowired
//  private UserService userService;
//
//  @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
//  public User getInfo(@PathVariable Integer id){
//    return userService.getById(id);
//  }
//
//  @RequestMapping(value = "/get/username",method = RequestMethod.GET)
//  public User getInfo(@RequestParam String username){
//    return userService.getByUsername(username);
//  }
//  @RequestMapping(value = "/get/phone",method = RequestMethod.GET)
//  public User get(@RequestParam String phone){
//    return userService.getByPhoneNumber(phone);
//  }
//  @RequestMapping(value = "/create",method = RequestMethod.POST)
//  public User create(@RequestBody User user){
//    return userService.create(user);
//  }
//
//  @RequestMapping(value = "/update",method = RequestMethod.PUT)
//  public User update(@RequestBody User user){
//    return userService.update(user);
//  }
//
//  @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
//  public void delete(@PathVariable Integer id){
//    userService.delete(id);
//  }
//
//
//}
