package runstatic.cloudexamples.cloudoauth2client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author chenmoand
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // @Bean
    // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //     http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
    //
    //     http.oauth2Login((login) -> login.redirectionEndpoint().baseUri("custom-callback"));
    //
    //     return http.build();
    // }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().authenticated()
                )
                .oauth2Login(oauth -> {
                    oauth.redirectionEndpoint(config -> {
                        config.baseUri("/authorized/{registrationId}");
                    })
                    .userInfoEndpoint(config ->  {
                        config.userAuthoritiesMapper(new SimpleAuthorityMapper())
                                .userService(new DefaultOAuth2UserService())
                                .oidcUserService(new OidcUserService());

                    });
                }).build();
    }

//    @Bean
//    AuthenticationManagerResolver<HttpServletRequest> tokenAuthenticationManagerResolver
//            (JwtDecoder jwtDecoder, OpaqueTokenIntrospector opaqueTokenIntrospector) {
//        AuthenticationManager jwt = new ProviderManager(new JwtAuthenticationProvider(jwtDecoder));
//        return (request) -> jwt;
//    }

}
