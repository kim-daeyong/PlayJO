package com.playjo.project.playjo.service.impl;


import com.playjo.project.playjo.domain.Role;
import com.playjo.project.playjo.domain.User;
import com.playjo.project.playjo.repository.RoleRepository;
import com.playjo.project.playjo.repository.UserRepository;
import com.playjo.project.playjo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public List<User> getUserAll(){
        return userRepository.findAll();
    }

    @Override
    public User joinUser(User user) {
        Role role = roleRepository.getRoleByName("USER");
        user.addRole(role);
        return userRepository.save(user);
    }

    //    @Transactional
//    public void deleteAccount(Long id) {
//        userRepository.deleteById(id);
//    }
}
