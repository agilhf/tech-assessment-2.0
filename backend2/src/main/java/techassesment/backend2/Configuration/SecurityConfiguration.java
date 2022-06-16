//package techassesment.backend2.Configuration;
//
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//public class SecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain filerChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("index.html", "/login").permitAll()
//                .anyRequest().authenticated()
//                .and().csrf()
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//                .and()
//                .httpBasic(withDefaults());;
//
//        return http.build();
//    }
//}
