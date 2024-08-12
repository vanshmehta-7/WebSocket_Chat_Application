package com.example.app.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    public String nickname;
    public String name;
    public Status status;
}
