package br.com.rocketseat.challenger01.course.modules.dto;

import java.util.List;

import br.com.rocketseat.challenger01.course.modules.entities.CourseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FindAllCoursesHTTPResponseDTO {
  private List<CourseEntity> courses;
}
