package com.javamaster.spring_crud.service;


import com.javamaster.spring_crud.dto.UsersDto;
import java.util.List;
import com.javamaster.spring_crud.exception.ValidationException;

public interface UsersService {

    UsersDto saveUser (UsersDto usersDto) throws ValidationException;

    void deleteUser (Integer userId) throws ValidationException;

    UsersDto findByLogin (String login) throws ValidationException;

    List<UsersDto> findAll() throws ValidationException;

}
