package softuni.mix_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.mix_shop.model.entity.UserEntity;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository <UserEntity,Long>{
    UserEntity findByUsername(String username);
}
