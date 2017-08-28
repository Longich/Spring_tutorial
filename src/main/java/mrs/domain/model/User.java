package mrs.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usr")
public class User {
    @Id @Getter @Setter
    private String userId;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private RoleName roleName;
    
    
}
