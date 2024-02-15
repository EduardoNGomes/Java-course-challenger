package br.com.rocketseat.challenger01.course.modules.useCases;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rocketseat.challenger01.course.modules.dto.FindAllCoursesDTO;
import br.com.rocketseat.challenger01.course.modules.entities.CourseEntity;
import br.com.rocketseat.challenger01.course.modules.enums.Active;
import br.com.rocketseat.challenger01.course.modules.repositories.CourseRepository;

@Service
public class FindAllCoursesUseCase {

  @Autowired
  private CourseRepository courseRepository;

  public List<CourseEntity> execute(FindAllCoursesDTO dto){

    List<CourseEntity> courses; 

    if(dto.getSearch().isEmpty()){
      courses = this.courseRepository.findAll();
    } else {
      courses = this.courseRepository.findAllByNameOrCategory(dto.getSearch(),dto.getSearch());
    }
    var result = courses.stream().filter(course -> course.getActive().equals(Active.ON)).collect(Collectors.toList());
    return result;
  }
  
}
