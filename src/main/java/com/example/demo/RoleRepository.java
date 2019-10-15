package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}