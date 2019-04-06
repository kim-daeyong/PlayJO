package com.playjo.project.playjo.service;

import com.playjo.project.playjo.domain.Role;
import com.playjo.project.playjo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Transactional
    public void addRole(Role role) {
        Role result = roleRepository.save(role);
        System.out.println(result.getId() + ", " + result.getName());
    }
}
