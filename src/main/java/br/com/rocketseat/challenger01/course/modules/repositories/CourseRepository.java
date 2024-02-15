package br.com.rocketseat.challenger01.course.modules.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rocketseat.challenger01.course.modules.entities.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity,UUID> {
  Optional<CourseEntity> findByName(String name);

  @SuppressWarnings("null")
  List<CourseEntity> findAll();

  List<CourseEntity> findAllByNameOrCategory(String name, String category);
}
