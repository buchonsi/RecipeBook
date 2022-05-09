package com.yoons.recipebook.model;

import com.yoons.recipebook.baisc.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserId;

    @Column(nullable = false)
    private String name;

    private String email;

    public User() {
    }

    public User(Long userId, String name, String email) {
        UserId = userId;
        this.name = name;
        this.email = email;
    }
}
