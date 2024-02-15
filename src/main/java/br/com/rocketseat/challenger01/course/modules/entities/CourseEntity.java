package br.com.rocketseat.challenger01.course.modules.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import br.com.rocketseat.challenger01.course.modules.enums.Active;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CourseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(unique = true)
  private String name;

  private Active active;

  @CreationTimestamp
  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @CreationTimestamp
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

}
