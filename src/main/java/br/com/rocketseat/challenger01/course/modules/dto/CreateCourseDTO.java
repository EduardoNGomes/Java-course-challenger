package br.com.rocketseat.challenger01.course.modules.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCourseDTO {
  @NotBlank(message = "name cannot be empty")
  @NotNull(message = "NAME is required")
  private String name;

  @NotBlank(message = "category cannot be empty")
  @NotNull(message = "CATEGORY is required")
  private String category;

}
