package com.wchan.rabbitmqdemo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString

public class User {

    private String username;
    private String password;
}
