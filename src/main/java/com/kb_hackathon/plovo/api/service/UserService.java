package com.kb_hackathon.plovo.api.service;

import com.kb_hackathon.plovo.api.entity.user.User;
import com.kb_hackathon.plovo.api.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(String userId) {
        return userRepository.findByUserId(userId);
    }
}
