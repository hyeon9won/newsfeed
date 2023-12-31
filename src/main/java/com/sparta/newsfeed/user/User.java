package com.sparta.newsfeed.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "users") // DB 에서 실제 사용 하는 경우가 있으니 Table 어노테이션 으로 적용
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 유저 ID값 적용

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String team;

    public User(String username, String password, String team) {
        this.username = username;
        this.password = password;
        this.team = team;

    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
