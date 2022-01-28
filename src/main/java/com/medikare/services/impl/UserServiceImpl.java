package com.medikare.services.impl;

import java.util.List;
import java.util.Set;

import com.medikare.helper.UserAlreadyExistsException;
import com.medikare.model.User;
import com.medikare.model.UserRole;
import com.medikare.repository.RoleRepository;
import com.medikare.repository.UserRepository;
import com.medikare.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    // creating user
    @Override
    public User creatUser(User user, Set<UserRole> roles) throws Exception{
       
        User local = this.userRepository.findByUsername(user.getUsername());
        if(local != null){
            System.out.println("User is already there");
            throw new UserAlreadyExistsException("user is already there");
        }else{
            for(UserRole userRole: roles){
                  this.roleRepository.save(userRole.getRole());
            }
         user.getUserRoles().addAll(roles);
         local = this.userRepository.save(user);   
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long id) {
      this.userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public User updateUser( User user,Set<UserRole> roles) {

          for(UserRole userRole: roles){
                  this.roleRepository.save(userRole.getRole());
            }
         user.getUserRoles().addAll(roles);
         
         return this.userRepository.save(user); 

    }

    @Override
    public List<User> getAlUsers() {
        return this.userRepository.findAll();
    }

    
    
}


