package softuni.mix_shop.service;

import softuni.mix_shop.model.entity.UserEntity;

public interface UserService {
    void save(UserEntity user);

    UserEntity findByUsername(String username);
}
