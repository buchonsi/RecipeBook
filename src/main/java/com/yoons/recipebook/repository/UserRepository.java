package com.yoons.recipebook.repository;

import com.yoons.recipebook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //사용자 아이디로 조회
    public Optional<User> findByUserId(String id);
}
