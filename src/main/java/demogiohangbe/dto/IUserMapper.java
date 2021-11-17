package demogiohangbe.dto;

import demogiohangbe.model.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IUserMapper {
    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    UserMapper userdto(Users users);
}



























