package com.user.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.user.Entity.userDetails;

public interface userRepo extends JpaRepository<userDetails,Long> {

	userDetails findByUserId(Long id);

}
