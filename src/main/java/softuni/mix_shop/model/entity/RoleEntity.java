package softuni.mix_shop.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_roles")
public class RoleEntity extends BaseEntity {
    private RoleEnum role;
    private List<UserEntity> users = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    public RoleEnum getRole() {
        return role;
    }

    public RoleEntity setRole(RoleEnum role) {
        this.role = role;
        return this;
    }
    @ManyToMany(mappedBy = "roles")
    public List<UserEntity> getUsers() {
        return users;
    }

    public RoleEntity setUsers(List<UserEntity> users) {
        this.users = users;
        return this;
    }
}
