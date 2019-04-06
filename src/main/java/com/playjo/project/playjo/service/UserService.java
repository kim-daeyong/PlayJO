package com.playjo.project.playjo.service;


import com.playjo.project.playjo.domain.Role;
import com.playjo.project.playjo.domain.User;
import com.playjo.project.playjo.repository.RoleRepository;
import com.playjo.project.playjo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public List<User> getUserAll(){
        return userRepository.findAll();
    }

    @Transactional
    public User join(User user) {

        Role role = roleRepository.getRoleByName("USER");
        user.addRole(role);
        return userRepository.save(user);
    }

    @Transactional
    public void deleteAccount(Long id) {
        userRepository.deleteById(id);
    }
}
