package com.playjo.project.playjo.config;


import org.springframework.boot.autoconfigure.security.reactive.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    // 아예 인가처리를 하지 않는 (무시하는 URL설정) - 이미지 or css, javascript
    @Override
    public void configure(WebSecurity web) throws Exception {

//    PathRequest.toStaticResources().atCommonLocations()
//    CSS(new String[]{"/css/**"}),
//    JAVA_SCRIPT(new String[]{"/js/**"}),
//    IMAGES(new String[]{"/images/**"}),
//    WEB_JARS(new String[]{"/webjars/**"}),
//    FAVICON(new String[]{"/**/favicon.ico"});
        web.ignoring()
//                .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
                .requestMatchers(new AntPathRequestMatcher("/**.html"))
                .requestMatchers(new AntPathRequestMatcher("/static/**"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .logout() // logout설정
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/main")
                .permitAll().and()
                .authorizeRequests() // 인가에 대한 설정
                .antMatchers(HttpMethod.GET,"/api/reply").permitAll()
                .antMatchers(HttpMethod.POST,"/api/reply").permitAll()
//                .antMatchers("/users/delete").permitAll()
                .antMatchers("/users/join").permitAll()
                .antMatchers("/users/welcome").permitAll()
                .antMatchers("/users/login").permitAll()
                .antMatchers("/users/**").hasAnyRole("USER", "ADMIN")
                
                .antMatchers("/places/images/**").permitAll()
                .antMatchers("/places/placewrite").hasAnyRole("USER", "ADMIN")
                .antMatchers("/places/{id}").permitAll()
                .antMatchers("/places/**").hasAnyRole("USER", "ADMIN")

                .antMatchers("/places/placedelete").hasAnyRole( "ADMIN")

                .antMatchers("/reviews/images/**").permitAll()
                .antMatchers("/reviews/reviewwrite").hasAnyRole("USER", "ADMIN")
                .antMatchers("/reviews/reviewdelete").hasAnyRole("USER", "ADMIN")
                .antMatchers("/reviews/{id}").permitAll()

                .antMatchers("/main").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin() // 사용자가 정의하는 로그인 화면을 만들겠다.
                .loginProcessingUrl("/login") // 로그인 화면
                .loginPage("/login") // 사용자가 입력한 id, password가 전달되는 url경로(필터가처리)
                .usernameParameter("email")
                .passwordParameter("password")
                .failureUrl("/login?fail=true").and().csrf().ignoringAntMatchers("/**");
    }
}
