package br.org.generation.blogpessoal.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.org.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails{
	
	private static final long serialVersionUID=1L;
	
	private String username;
	private String password;
	
	public UserDetailsImpl(Usuario user){
		this.username = user.getNome();
		this.password = user.getSenha();
	}
	
	public UserDetailsImpl(){}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return getAuthorities();
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
