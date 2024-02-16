package br.com.rocketseat.challenger01.course.modules.controllers.Courses;

import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.exception.ErrorResponse;
import br.com.rocketseat.challenger01.course.modules.useCases.ChangeActiveUseCase;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/course")
public class ChangeActiveCourseController {

  @Autowired
  private ChangeActiveUseCase changeActiveUseCase;
  
  @PatchMapping("/{id}/active")
  public ResponseEntity<Object> changeActive(@PathVariable UUID id) {
      
      try {
        var result = this.changeActiveUseCase.execute(id);
        Map<String,String> httpResponse = new HashMap<>();
        httpResponse.put("message", result);
        return ResponseEntity.ok().body(httpResponse);       
      } catch (Exception e) {
        var errorResponse = ErrorResponse.builder().message(e.getMessage()).build();
        return ResponseEntity.badRequest().body(errorResponse);
      }
      
  }
}
