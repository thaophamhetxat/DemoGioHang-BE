package demogiohangbe.service;

import demogiohangbe.model.Users;
import demogiohangbe.repository.IUsersRepository;
import demogiohangbe.service.Impl.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsersService implements IUsersService {
    @Autowired
    IUsersRepository iUsersRepository;


    @Override
    public Users save(Users users) {
        return iUsersRepository.save(users);
    }

    @Override
    public Optional<Users> findById(long id) {
        return iUsersRepository.findById(id);
    }

    @Override
    public ArrayList<Users> findAll() {
        return (ArrayList<Users>) iUsersRepository.findAll();
    }

    @Override
    public ArrayList<Users> findAllByName(String name) {
        return null;
    }

    @Override
    public void delete(Users users) {
        iUsersRepository.delete(users);
    }

    @Override
    public void edit(Users users) {
        iUsersRepository.save(users);
    }
}
