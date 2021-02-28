package softuni.mix_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuni.mix_shop.model.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}
