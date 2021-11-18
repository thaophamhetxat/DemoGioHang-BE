package demogiohangbe.service.Impl;

import demogiohangbe.model.Users;

import java.util.ArrayList;
import java.util.Optional;

public interface IUsersService {
    Users save(Users users);
    Optional<Users> findById(long id);

    ArrayList<Users> findAll();

    ArrayList<Users> findAllByName(String name);

    void delete(Users users);

    void edit(Users users);
}
