package br.com.rocketseat.challenger01.course.modules.useCases;

import org.springframework.stereotype.Service;

@Service
public class AliveUseCase {
  
  public String execute(){
    return "I'm alive XD";
  }
}
