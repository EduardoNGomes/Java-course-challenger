package br.com.rocketseat.challenger01.course.modules.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rocketseat.challenger01.course.modules.entities.CourseEntity;
import br.com.rocketseat.challenger01.course.modules.enums.Active;
import br.com.rocketseat.challenger01.course.modules.repositories.CourseRepository;

@Service
public class ChangeActiveUseCase {
  @Autowired
  private CourseRepository courseRepository;

  private CourseEntity courseToUpdate;

  @SuppressWarnings("null")
  public String execute(UUID id) throws Exception{
    if(id.toString().isEmpty()){
      throw new Exception("Resource not found");
    }

    var course = this.courseRepository.findById(id);

    if(course.isEmpty()){
      throw new Exception("Resource not found");
    }

    if(course.get().getActive().equals(Active.ON)){
      courseToUpdate = CourseEntity.builder()
      .active(Active.OFF)
      .name(course.get().getName())
      .category(course.get().getCategory())
      .id(course.get().getId())
      .createdAt(course.get().getCreatedAt())
      .build();
    }else{
      courseToUpdate = CourseEntity.builder()
      .active(Active.ON)
      .name(course.get().getName())
      .category(course.get().getCategory())
      .id(course.get().getId())
      .createdAt(course.get().getCreatedAt())
      .build();
    }

    this.courseRepository.save(courseToUpdate);

    if(courseToUpdate.getActive().equals(Active.ON)){
      return "This course is actived now";
    }else {
      return "This course is disabled now";
    }

  }
}
