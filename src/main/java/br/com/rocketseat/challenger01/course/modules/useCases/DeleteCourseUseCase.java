package br.com.rocketseat.challenger01.course.modules.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rocketseat.challenger01.course.modules.repositories.CourseRepository;

@Service
public class DeleteCourseUseCase {
  
  @Autowired
  private CourseRepository courseRepository;


  public void execute(UUID id) throws Exception {
    if(id.toString().isEmpty()){
      throw new Exception("Resource not found");
    }

    this.courseRepository.deleteById(id);
  }
}
