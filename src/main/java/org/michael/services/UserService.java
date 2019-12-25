package org.michael.services;

import org.michael.entities.UserEntity;
import org.michael.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAll(){
        ArrayList<UserEntity> users = new ArrayList<>();
        userRepository.findAll().forEach(u->users.add(u));
        return users;
    }

    public UserEntity getById(int userId){
        return userRepository.findById(userId).get();
    }

    public void addUser(UserEntity newUser){
        userRepository.save(newUser);
    }

    public void removeUser(int userId){
        userRepository.deleteById(userId);
    }

    public void removeUser(UserEntity user){
        userRepository.delete(user);
    }

    public UserEntity editUser(UserEntity editUser,int userId){
        editUser.setUserId(userId);
        userRepository.save(editUser);
        return editUser;
    }


}
