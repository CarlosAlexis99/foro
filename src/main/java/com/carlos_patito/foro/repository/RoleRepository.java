package com.carlos_patito.foro.repository;


import com.carlos_patito.foro.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findRoleByRoleEnumIn(List<String> roles);
}
