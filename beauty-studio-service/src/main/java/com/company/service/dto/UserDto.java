package com.company.service.dto;

import lombok.Data;

@Data
public class UserDto extends AbstractDto{
    private String name;
    private String password;
}