package com.iba.the_java_banking_app.repository;

import com.iba.the_java_banking_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
