//package com.example.demo.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
///*
//@EnableWebSecurity 는 기본적인 Web 보안을 활성화 하겠다는 어노테이션이고,
//추가적인 설정을 위해서 WebSecurityConfigurer을 implements하거나
//WebSecurityConfigurerAdapter를 extends하는 방법이 있습니다.
// */
//@EnableWebSecurity
//public class SecurityConfigTest extends WebSecurityConfigurerAdapter {
//
//    //h2-console 페이지의 접근은 Spring Security 관련 로직을 수행하지 않도록 configure(WebSecurity web)를 오버라이드한 메소드를 새롭게 추가합니다.
//    //따라서 h2-console/하위 모든 요청, /favicon.ico에 대한 요청은 Spring Security 로직을 수행하지 않고 접근할 수 있게 됩니다.
//    @Override
//    public void configure(WebSecurity web) {
//        web
//                .ignoring()
//                .antMatchers(
//                        "/h2-console/**"
//                        ,"/favicon.ico"
//                );
//    }
//
//    //configure 메소드를 오버라이드하여 /api/hello에 대한 접근이 인증없이 접근될 수 있도록 허용합니다.
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/api/hello").permitAll() //해당 경로로 들어오는 요청은 인증없이 진행함
//                .anyRequest().authenticated();// 나머지 요청은 모두 인증되어야한다는 의미
//    }
//
//}