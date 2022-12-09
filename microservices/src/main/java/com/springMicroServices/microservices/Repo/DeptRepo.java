package com.springMicroServices.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springMicroServices.microservices.Entity.DeptEntity;
@Repository
public interface DeptRepo extends JpaRepository<DeptEntity,Long> {

	DeptEntity findByDeptId(Long id);

}
