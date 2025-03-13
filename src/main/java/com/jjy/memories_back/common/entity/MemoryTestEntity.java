package com.jjy.memories_back.common.entity;

import com.jjy.memories_back.common.entity.pk.MemoryTestPk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="memoryTest")
@Table(name="memory_test")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(MemoryTestPk.class)
public class MemoryTestEntity {
  
  @Id
  private String userid;
  @Id
  private Integer sequence;
  private Integer measurementTime;
  private String testDate;
  private Integer gap;

}
