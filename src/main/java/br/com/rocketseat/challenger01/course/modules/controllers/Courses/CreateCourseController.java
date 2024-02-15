package br.com.rocketseat.challenger01.course.modules.controllers.Courses;

import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.dto.CreateCourseDTO;
import br.com.rocketseat.challenger01.course.modules.exception.ErrorResponse;
import br.com.rocketseat.challenger01.course.modules.useCases.CreateCourseUseCase;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/course")
public class CreateCourseController {

  @Autowired
  private CreateCourseUseCase createCourseUseCase;

  @PostMapping("/create")
  public ResponseEntity<Object> Create(@Valid @RequestBody CreateCourseDTO dto) {     
    try {
      var result = this.createCourseUseCase.execute(dto);
      return ResponseEntity.status(201).body(result);
    } catch (Exception e) {

      var errorResponse = ErrorResponse.builder().message(e.getMessage()).build();

      return ResponseEntity.badRequest().body(errorResponse);
    }
  }

}
