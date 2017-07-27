package com.example;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Repository for entity {@link User}
 */
interface UserRepository extends JpaRepository<User, Integer> {

}
