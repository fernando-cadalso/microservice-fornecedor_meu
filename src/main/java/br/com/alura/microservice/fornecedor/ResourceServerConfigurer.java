package br.com.alura.microservice.fornecedor;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		/*
		 * Apenas as requisições POST para /pedido serão autenticadas
		 * e apenas os usuários com o papel USER serão autorizados.
		 */
		http.authorizeRequests().antMatchers(HttpMethod.POST, "/pedido").hasRole("USER");
	}
}