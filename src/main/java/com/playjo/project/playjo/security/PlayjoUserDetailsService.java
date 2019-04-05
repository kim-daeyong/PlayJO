package com.playjo.project.playjo.security;


import com.playjo.project.playjo.domain.Role;
import com.playjo.project.playjo.domain.User;
import com.playjo.project.playjo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor // final 인 필드만 초기화하는 생성자가 자동으로 만들어진다. 생성자주입시 사용
public class PlayjoUserDetailsService implements UserDetailsService {
        private final UserRepository userRepository;

        @Override
        @Transactional(readOnly = false)
        public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
            User user =
                    userRepository.getUserByEmail(email);
            if(user == null)
                throw new UsernameNotFoundException(email + "에 해당하는 사용자 없어요!");

            List<GrantedAuthority> authorities = new ArrayList<>();
            Set<Role> roles = user.getRoles();
            for(Role role : roles){
                authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
            }

            PlayjoSecurityUser playjoSecurityUser = new PlayjoSecurityUser(email, user.getPassword(), authorities);
//            playjoSecurityUser.setId(user.getId());
//            playjoSecurityUser.setName(user.getName());
//            playjoSecurityUser.setNickName(user.getNickName());




            return playjoSecurityUser;
        }

}
