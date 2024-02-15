package br.com.rocketseat.challenger01.course.modules.controllers.Courses;

import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.dto.CreateCourseDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/course")
public class CreateCourse {

  @PostMapping("/create")
  public void Create(@RequestBody CreateCourseDTO dto) {
      //TODO: process POST request
      
  }
  
  
}
