package com.example.csharing.domain;

import javax.persistence.*;

@Entity
public class UserNickName {
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
