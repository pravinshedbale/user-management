package com.example.usermanagement.mapper;

import com.example.usermanagement.dto.UserDto;
import com.example.usermanagement.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    public UserDto mapToUserDto(User user);
    public  User mapToUser(UserDto userDto);
}
