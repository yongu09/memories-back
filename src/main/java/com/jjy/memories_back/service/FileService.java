package com.jjy.memories_back.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
  
  String upload(MultipartFile file);
}
