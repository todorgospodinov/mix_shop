//package softuni.mix_shop.config;
//
//import javax.sql.DataSource;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import softuni.mix_shop.user.DemoUserDetailsService;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final PasswordEncoder passwordEncoder;
//    private final DemoUserDetailsService userDetailsService;
//
//    public SecurityConfig(PasswordEncoder passwordEncoder,
//                          DemoUserDetailsService userDetailsService) {
//        this.passwordEncoder = passwordEncoder;
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.
//                userDetailsService(userDetailsService).
//                passwordEncoder(passwordEncoder);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                authorizeRequests().
//                antMatchers("/h2_console/**", "/home").permitAll().
//                antMatchers("/admin").hasRole("ADMIN").
//                antMatchers("/user").hasRole("USER").
//                and().
//                formLogin();
//
//        //h2 magic, TODO: delete me
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//    }
//}