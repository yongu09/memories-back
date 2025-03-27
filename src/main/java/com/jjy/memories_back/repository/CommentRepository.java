package com.jjy.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jjy.memories_back.common.entity.CommentEntity;

import jakarta.transaction.Transactional;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {

  List<CommentEntity> findByDiaryNumberOrderByWriteDateDesc(Integer diaryNumber);
  
  @Transactional
  void deleteByDiaryNumber(Integer DiaryNumber);

}
