package com.playjo.project.playjo.security;


import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Setter
@Getter
public class PlayjoSecurityUser extends User {

    private Long id;
    private String nickName;
    private String name;


    public PlayjoSecurityUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, true, true, true, true, authorities);
    }

    public String getEmail(){
        return super.getUsername();
    }
}
