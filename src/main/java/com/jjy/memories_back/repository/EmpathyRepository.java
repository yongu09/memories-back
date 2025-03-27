package com.jjy.memories_back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jjy.memories_back.common.entity.EmpathyEntity;
import com.jjy.memories_back.common.entity.pk.EmpathyPk;

import jakarta.transaction.Transactional;

@Repository
public interface EmpathyRepository extends JpaRepository<EmpathyEntity, EmpathyPk> {

  EmpathyEntity findByUserIdAndDiaryNumber(String userId, Integer diaryNumber);
  List<EmpathyEntity> findByDiaryNumber(Integer diaryNumber);

  @Transactional
  void deleteByDiaryNumber(Integer DiaryNumber);
  
}
