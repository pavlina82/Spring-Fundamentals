package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import model.enums.RoleEnums;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{

    @Enumerated(value = EnumType.STRING)
    private RoleEnums roleEnums;

    public RoleEnums getRoleEnums() {
        return roleEnums;
    }

    public void setRoleEnums(RoleEnums roleEnums) {
        this.roleEnums = roleEnums;
    }
}
