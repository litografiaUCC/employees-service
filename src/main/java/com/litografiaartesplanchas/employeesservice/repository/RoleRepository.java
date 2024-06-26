package com.litografiaartesplanchas.employeesservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.litografiaartesplanchas.employeesservice.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
