package com.bus.fare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.fare.entity.EmployeeEntity;
@Repository
public interface TeacherAtJpaRepository extends JpaRepository<EmployeeEntity,Integer> {

}
