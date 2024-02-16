package br.com.rocketseat.challenger01.course.modules.controllers.Courses;

import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.exception.ErrorResponse;
import br.com.rocketseat.challenger01.course.modules.useCases.DeleteCourseUseCase;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/course")

public class DeleteCourseController {

  @Autowired
  private DeleteCourseUseCase deleteCourseUseCase;
  
  @DeleteMapping("{id}")
  public ResponseEntity<Object> delete(@PathVariable UUID id) {
    
    try {
      this.deleteCourseUseCase.execute(id);
      return ResponseEntity.ok().body("");
    } catch (Exception e) {
      var errorResponse = ErrorResponse.builder().message(e.getMessage()).build();
       return ResponseEntity.badRequest().body(errorResponse);
    }

  }
}
