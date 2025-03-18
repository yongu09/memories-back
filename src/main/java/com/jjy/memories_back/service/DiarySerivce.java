package com.jjy.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jjy.memories_back.common.dto.request.diary.PostDiaryRequestDto;
import com.jjy.memories_back.common.dto.response.ResponseDto;
import com.jjy.memories_back.common.dto.response.diary.GetDiaryResponseDto;
import com.jjy.memories_back.common.dto.response.diary.GetMyDiaryResponseDto;

public interface DiarySerivce {
  ResponseEntity<ResponseDto> postDiary(PostDiaryRequestDto dto, String userId);
  ResponseEntity<? super GetMyDiaryResponseDto> getMyDiary(String userId);
  ResponseEntity<? super GetDiaryResponseDto> getDiary(Integer diaryNumber);
}