package com.jjy.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jjy.memories_back.common.dto.request.auth.IdCheckRequestDto;
import com.jjy.memories_back.common.dto.request.auth.SignUpRequestDto;
import com.jjy.memories_back.common.dto.response.ResponseDto;

public interface AuthService {
  ResponseEntity<ResponseDto> idCheck(IdCheckRequestDto dto);
  ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
}
