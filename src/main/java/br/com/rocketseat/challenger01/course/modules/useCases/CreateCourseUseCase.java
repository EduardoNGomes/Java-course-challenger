package br.com.rocketseat.challenger01.course.modules.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rocketseat.challenger01.course.modules.dto.CreateCourseDTO;
import br.com.rocketseat.challenger01.course.modules.entities.CourseEntity;
import br.com.rocketseat.challenger01.course.modules.enums.Active;
import br.com.rocketseat.challenger01.course.modules.repositories.CourseRepository;

@Service
public class CreateCourseUseCase {
  
  @Autowired
  private CourseRepository courseRepository; 

  public CourseEntity execute(CreateCourseDTO dto) throws Exception{
    var courseAlreadyExist = this.courseRepository.findByName(dto.getName());

    if (courseAlreadyExist.isPresent()){
      throw new Exception("This course already exist");
    }

    var course = CourseEntity.builder()
    .active(Active.OFF)
    .name(dto.getName())
    .category(dto.getCategory())
    .build();
    
    @SuppressWarnings("null")
    var result = this.courseRepository.save(course);
    

    return result;
  }
}
