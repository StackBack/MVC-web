package com.example.myproject.services;

import com.example.myproject.domain.CustomUser;
import com.example.myproject.repository.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepo userRepo;

    public UserService(PasswordEncoder passwordEncoder, UserRepo userRepo) {
        this.passwordEncoder = passwordEncoder;
        this.userRepo = userRepo;
    }

    @Transactional(readOnly = true)
    public CustomUser findByLogin(String login) {
        return userRepo.findByLogin(login);
    }

    @Transactional
    public boolean addUser(CustomUser user) {
        if(userRepo.existsByLogin(user.getLogin())
                || user.getPassword().matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,16}")
                || user.getLogin().matches("^[a-zA-Z][a-zA-Z0-9-_\\.]{2,20}$"))
            return false;
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return true;
    }
}
