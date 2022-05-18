package com.yoons.recipebook.repository;

import com.yoons.recipebook.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

//@Todo repo testDB용 Test 추후 진행
@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @AfterEach
    void afterEach() {
//        userRepository.deleteAll();
    }

    //생성
    @Test
    void 유저_생성(){
//        //given
//        User userA = User.builder()
//                .name("윤").userId("buchonsi").password("1234")
//                .build();
//
//        //when
//        User savedUser = userRepository.save(userA);
//        User findedUser = userRepository.findByUserId("buchonsi").get();
//
//        //then
//        assertThat(savedUser).isEqualTo(findedUser);
//        assertThat(savedUser).isEqualTo(userA);

    }
    //조회
    @Test
    void 전체조회(){
        List<User> userList = userRepository.findAll();
        if(userList == null) {
            System.out.println("test");
        }
    }

    //아이디로 조회
    //수정
    //삭제


}