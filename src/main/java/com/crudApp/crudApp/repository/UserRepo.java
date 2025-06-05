package com.crudApp.crudApp.repository;

import com.crudApp.crudApp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
}
