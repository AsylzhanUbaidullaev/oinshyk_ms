//package com.example.gateway.service;
//
//
//import com.example.gateway.model.User;
//import com.example.gateway.repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService implements  UserDetailsService {
//
//  @Autowired
//  private UserRepo userRepo;
//
//  @Autowired
//  private BCryptPasswordEncoder passwordEncoder;
//
//  public User create(User user) {
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    return userRepo.save(user);
//  }
//
//  public User update(User user) {
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    return userRepo.save(user);
//  }
//
//  public void delete(Integer id) {
//    userRepo.delete(userRepo.getById(id));
//  }
//
//  public List<User> getAll() {
//    return userRepo.findAll();
//  }
//
//  public User getById(Integer id) {
//    return userRepo.getById(id);
//  }
//
//  public User getByUsername(String username) {
//    return userRepo.getByUsername(username);
//  }
//
//  public User getByPhoneNumber(String phone) {
//    return userRepo.getByPhoneNumber(phone);
//  }
//
//  @Override
//  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//    return userRepo.getByUsername(s);
//  }
//}
