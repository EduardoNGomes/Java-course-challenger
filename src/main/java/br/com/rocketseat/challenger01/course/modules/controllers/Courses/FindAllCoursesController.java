package br.com.rocketseat.challenger01.course.modules.controllers.Courses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.dto.FindAllCoursesDTO;
import br.com.rocketseat.challenger01.course.modules.entities.CourseEntity;
import br.com.rocketseat.challenger01.course.modules.useCases.FindAllCoursesUseCase;

@RestController
@RequestMapping("/course")
public class FindAllCoursesController {
  
  @Autowired
  private FindAllCoursesUseCase findAllCoursesUseCase;

  @GetMapping("")
  public ResponseEntity<Object> GetAll(@RequestParam(required = false) String search) {

    var dto = FindAllCoursesDTO.builder().search(search).build();
    var result = this.findAllCoursesUseCase.execute(dto);

    Map<String,List<CourseEntity>> httpResponse = new HashMap<>();
    httpResponse.put("courses", result);
    return ResponseEntity.ok().body(httpResponse);
  }
  
}
