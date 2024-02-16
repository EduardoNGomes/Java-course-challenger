package br.com.rocketseat.challenger01.course.modules.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rocketseat.challenger01.course.modules.dto.UpdateCourseDTO;
import br.com.rocketseat.challenger01.course.modules.entities.CourseEntity;
import br.com.rocketseat.challenger01.course.modules.repositories.CourseRepository;

@Service
public class UpdateCourseUseCase {
  @Autowired
  private CourseRepository courseRepository; 

  private String nameToUpdate;
  private String categoryToUpdate;

  public CourseEntity execute(UUID id, UpdateCourseDTO dto) throws Exception{

    if(id.toString().isEmpty()){
      throw new Exception("Resource not found");
    }

    var course = this.courseRepository.findById(id);

    if(course.isEmpty()){
      throw new Exception("Resource not found");
    }


    if(dto.getName() != null){
      this.nameToUpdate = dto.getName().get();
    }else {
      this.nameToUpdate = course.get().getName();
    }

    if(dto.getCategory() != null){
      this.categoryToUpdate = dto.getCategory().get();
    }else {
      this.categoryToUpdate = course.get().getCategory();
    }

    var courseToUpdated = CourseEntity.builder()
    .id(id)
    .active(course.get().getActive())
    .category(categoryToUpdate)
    .createdAt(course.get().getCreatedAt())
    .name(nameToUpdate)
    .build();

    @SuppressWarnings("null")
    var courseUpdated = this.courseRepository.save(courseToUpdated);

    return courseUpdated;
    
  }
}
