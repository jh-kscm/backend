package com.demo.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * @title  : ApiController 클래스
 * @author : Moon Jihyun
 * @since  : 2024-12-19
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-12-19    Moon Jihyun        ApiController 최초생성
 * </pre>
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
class ApiController {

  @GetMapping("/api/one")
  public String getApiOne() {
    return "Response from API One";
  }
}