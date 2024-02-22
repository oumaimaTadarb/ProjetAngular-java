package com.management.repositories;

import com.management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface UserRepository extends JpaRepository<User,Long> {

    User findByNameUser(String nameUser);
}
