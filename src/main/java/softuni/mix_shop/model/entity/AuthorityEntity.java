package softuni.mix_shop.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class AuthorityEntity extends BaseEntity {


    private String name;
    private UserEntity user;

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public AuthorityEntity setName(String name) {
        this.name = name;
        return this;
    }
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public UserEntity getUser() {
        return user;
    }

    public AuthorityEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }
}