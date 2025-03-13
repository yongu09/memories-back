package com.jjy.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jjy.memories_back.common.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
  
}
