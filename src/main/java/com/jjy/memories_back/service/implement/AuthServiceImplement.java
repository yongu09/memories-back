package com.jjy.memories_back.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jjy.memories_back.common.dto.request.auth.IdCheckRequestDto;
import com.jjy.memories_back.common.dto.response.ResponseDto;
import com.jjy.memories_back.repository.UserRepository;
import com.jjy.memories_back.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplement implements AuthService {

  private final UserRepository userRepository;

  @Override
  public ResponseEntity<ResponseDto> idCheck(IdCheckRequestDto dto) {
    
    try {
      
      String userId = dto.getUserId();
      boolean existUser = userRepository.existsById(userId);
      if (existUser) return ResponseDto.existUser();

    } catch (Exception exception) {
      exception.printStackTrace();
      return ResponseDto.databaseError();
    }

    return ResponseDto.success(HttpStatus.OK);
  }

}