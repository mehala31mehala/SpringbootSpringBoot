package com.User.example.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.example.application.dto.UserDto;
import com.User.example.application.entity.User;
import com.User.example.application.repository.UserRepository;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private ModelMapper modelMapper = new ModelMapper();

//    public UserDTO convertUserDAOToDTO(Optional<UserDAO> userDAO){
//        return modelMapper.map(userDAO, UserDTO.class);
//    }

    public User convertUserDtoToEntity(UserDto userDTO){
        return modelMapper.map(userDTO, User.class);
    }

    public ArrayList<UserDto> getAllUsers(){
        List<User> users =  userRepository.findAll();
        ArrayList<UserDto> userDTOS = new ArrayList<UserDto>();
        for (User user: users) {
           // userDTOS.add(this.convertUserDAOToDTO(Optional.ofNullable(userDAo)));
            userDTOS.add(modelMapper.map(user, UserDto.class));

        }
        return userDTOS;
    }

    public UserDto getUserByID(Integer user_id){
        Optional<User> userDAO = userRepository.findById(user_id);
        //return this.convertUserDAOToDTO(userDAO);
        return modelMapper.map(userDAO.get(), UserDto.class);
    }

    public UserDto createUser(UserDto userDTO){
        User user = this.convertUserDtoToEntity(userDTO);
        user = userRepository.save(user);
       // return this.convertUserDAOToDTO(Optional.of(userDAO));
        return modelMapper.map(user, UserDto.class);
    }

    public UserDto updateUser(Integer user_id, UserDto userDTO){
        User user = this.convertUserDtoToEntity(userDTO);
        user.setId(user_id);
        user = userRepository.save(user);
       // return this.convertUserDAOToDTO(Optional.of(userDAO));
        return modelMapper.map(user, UserDto.class);
    }

    public void deleteUser(Integer user_id){
        userRepository.deleteById(user_id);
    }
}
