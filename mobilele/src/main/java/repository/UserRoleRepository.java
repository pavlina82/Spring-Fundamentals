package repository;

import model.entity.RoleEntity;
import model.enums.RoleEnums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByRole(RoleEnums roleEnums);

    RoleEntity findByUser(RoleEnums roleEnums);
}
