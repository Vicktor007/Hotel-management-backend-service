package com.vic.lakesidehotel.service;

import com.vic.lakesidehotel.model.Role;
import com.vic.lakesidehotel.model.User;
import com.vic.lakesidehotel.repository.RoleRepository;
import com.vic.lakesidehotel.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
@RequiredArgsConstructor
public class DataInitializationComponent implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        initializeRoles();
        initializeAdminUser();
    }

    private void initializeRoles() {
        createRoleIfNotExist("ROLE_USER");
        createRoleIfNotExist("ROLE_ADMIN");
    }

    private void createRoleIfNotExist(String roleName) {
        if (!roleRepository.existsByName(roleName)) {
            Role role = new Role(roleName);
            roleRepository.save(role);
        }
    }

    private void initializeAdminUser() {
        String adminEmail = "vicktord007@gmail.com";
        if (userRepository.findByEmail(adminEmail).isEmpty()) {
            User adminUser = new User();
            adminUser.setPassword(passwordEncoder.encode("vickdawson007"));
            adminUser.setFirstName("Victor");
            adminUser.setEmail(adminEmail);
            adminUser.setLastName("Olayiwola");

            // Fetch the admin role from the database
            Role adminRole = roleRepository.findByName("ROLE_ADMIN")
                    .orElseThrow(() -> new RuntimeException("ROLE_ADMIN not found"));

            // Associate the admin role with the admin user
            adminUser.setRoles(Collections.singletonList(adminRole));

            // Save the admin user
            userRepository.save(adminUser);
        }
    }
}