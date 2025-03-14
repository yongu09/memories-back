package com.jjy.memories_back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjy.memories_back.common.dto.request.auth.IdCheckRequestDto;
import com.jjy.memories_back.common.dto.response.ResponseDto;
import com.jjy.memories_back.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService; /* 의존성 주입 _ service package에 AuthService를 하고 RequiredArgsConstructor 어노테이션 해주는*/
  
  @PostMapping("/id-check")
  public ResponseEntity<ResponseDto> idCheck(
    @RequestBody @Valid IdCheckRequestDto requestBody
  ) {
    ResponseEntity<ResponseDto> response = authService.idCheck(requestBody);
    return response;
  }

}
