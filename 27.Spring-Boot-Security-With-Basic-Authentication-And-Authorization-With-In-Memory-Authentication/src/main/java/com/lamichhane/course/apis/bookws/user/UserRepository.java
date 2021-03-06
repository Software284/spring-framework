package com.lamichhane.course.apis.bookws.user;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserRepository {

	private static List<User> users;

    private static ObjectMapper mapper = new ObjectMapper();

    static {
        try {
            File file = ResourceUtils.getFile("classpath:user-credentials.json");
            users = mapper.readValue(file, new TypeReference<List<User>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Optional<User> findByUsername(String username) {

        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst();
    }
}
