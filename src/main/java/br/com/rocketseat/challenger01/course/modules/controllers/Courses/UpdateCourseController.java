package br.com.rocketseat.challenger01.course.modules.controllers.Courses;

import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.dto.UpdateCourseDTO;
import br.com.rocketseat.challenger01.course.modules.exception.ErrorResponse;
import br.com.rocketseat.challenger01.course.modules.useCases.UpdateCourseUseCase;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/course")
public class UpdateCourseController {

  @Autowired
  private UpdateCourseUseCase updateCourseUseCase;

  @PutMapping("/{id}")
  public ResponseEntity<Object> update(@PathVariable UUID id,@Valid @RequestBody UpdateCourseDTO dto) {
      try {
        var result = this.updateCourseUseCase.execute(id, dto);

        return ResponseEntity.ok().body(result);
      } catch (Exception e) {
        var errorResponse = ErrorResponse.builder().message(e.getMessage()).build();
        return ResponseEntity.badRequest().body(errorResponse);
      }
      
  }
}
