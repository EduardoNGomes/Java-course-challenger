package br.com.rocketseat.challenger01.course.modules.controllers.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.dto.FindAllCoursesDTO;
import br.com.rocketseat.challenger01.course.modules.dto.FindAllCoursesHTTPResponseDTO;
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

    var httpResponse = FindAllCoursesHTTPResponseDTO.builder().courses(result).build();
    return ResponseEntity.ok().body(httpResponse);
  }
  
}
