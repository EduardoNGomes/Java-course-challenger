package br.com.rocketseat.challenger01.course.modules.dto;



import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCourseDTO {
  private Optional<String> name;

  private Optional<String> category;

}
