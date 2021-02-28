package softuni.mix_shop.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import softuni.mix_shop.model.entity.UserEntity;
import softuni.mix_shop.repository.RoleRepository;
import softuni.mix_shop.repository.UserRepository;

import java.util.HashSet;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public void save(UserEntity user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles((roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public UserEntity findByUsername(String username) {

        return userRepository.findByUsername(username);
    }
}
