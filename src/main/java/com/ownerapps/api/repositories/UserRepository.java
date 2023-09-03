package com.ownerapps.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ownerapps.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
