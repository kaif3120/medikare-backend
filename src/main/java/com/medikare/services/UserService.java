package com.medikare.services;

import java.util.List;
import java.util.Set;

import com.medikare.model.User;
import com.medikare.model.UserRole;


public interface UserService {
    
    public User creatUser(User user,Set<UserRole> roles) throws Exception;

    public User getUser(String username);

    public  void deleteUser(Long id);

    public User getUserById(Long id);

    public User updateUser( User user, Set<UserRole> roles);

    public List<User> getAlUsers();
}
