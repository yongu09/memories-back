package com.jjy.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jjy.memories_back.common.dto.request.user.PatchUserRequestDto;
import com.jjy.memories_back.common.dto.response.ResponseDto;
import com.jjy.memories_back.common.dto.response.user.GetSignInUserResponseDto;

public interface UserService {
  ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String userId);
  ResponseEntity<ResponseDto> patchUser(PatchUserRequestDto dto, String userId);
}
