package com.example.demo.config;

import com.example.demo.component.RestAuthenticationEntryPoint;
import com.example.demo.component.RestfulAccessDeniedHandler;
import com.example.demo.fliter.JwtAuthenticationTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @Description:
 * @author: df36643264
 * @date: 2021年03月30日 10:41 上午
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;
    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//      http.formLogin()
////                .loginPage("/jsp/login.html")            //登录页面设置
////                .loginProcessingUrl("/user/login")   //登录访问路径
////                .defaultSuccessUrl("/swagger-ui.html")    //登录成功之后跳转路径
////                .permitAll()
////                .and()
////                .authorizeRequests()
////                .antMatchers("/","/hello","/swagger-ui.html")
////                .permitAll()
////                .and()
////                .authorizeRequests().antMatchers(HttpMethod.OPTIONS)
////                .permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .csrf()
////                .disable()
////                .sessionManagement()
////                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);                 //关闭csrf防护
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http
                .authorizeRequests();
        registry.antMatchers(HttpMethod.OPTIONS)
                .permitAll();
//        registry.and()
//                .exceptionHandling().accessDeniedPage("/unauth.html");
//        registry.and()
//                .formLogin()
//                .loginPage("/login.html")
//                .loginProcessingUrl("/user/login")
//                .defaultSuccessUrl("/swagger-ui.html")
//                .permitAll();
        registry.and()
                .authorizeRequests()
                .antMatchers("/","/user/login","/login", "/swagger-ui.html")
                .permitAll()
                .antMatchers("/addGood")
                .hasAuthority("admin")
                .antMatchers("/hello")
                .hasAuthority("admin")
                .anyRequest()
                .authenticated()
                .and()
                .csrf()
                .disable();
        // 禁用缓存
        registry.and()
                .headers()
                .cacheControl();
        //添加JWT filter
        registry.and()
                .addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);

        //添加自定义未授权和未登录结果返回
        registry.and()
                .exceptionHandling()
                .accessDeniedHandler(restfulAccessDeniedHandler)
                .authenticationEntryPoint(restAuthenticationEntryPoint);
    }

    /**
     *@Description: 实现查询数据库账号密码实现登录
     * @param auth
     *@return: void
     *@author: df36643264
     *@date: 2021/3/30 11:03 上午
     **/

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(password());

    }

    @Bean
    PasswordEncoder password() {return new BCryptPasswordEncoder();}

    @Bean
    JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {return new JwtAuthenticationTokenFilter();}


}
