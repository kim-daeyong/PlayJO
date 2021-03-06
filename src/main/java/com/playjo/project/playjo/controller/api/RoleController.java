package com.playjo.project.playjo.controller.api;


import com.playjo.project.playjo.domain.Role;
import com.playjo.project.playjo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/roleform")
    public String roleform(){
        return "roleform";
    }

    @PostMapping("/rolesave")
    public String rolesave(@RequestParam(name = "name")String name){
        Role role = new Role();
        role.setName(name);
        roleService.addRole(role);
        return "redirect:/roleform";
    }
}
