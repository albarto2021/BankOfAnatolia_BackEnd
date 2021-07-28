package com.bank.payload.response;

import com.bank.dao.UserDAO;
import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    List<UserDAO> users;
}