package br.com.rocketseat.challenger01.course.modules.controllers.alive;

import org.springframework.web.bind.annotation.RestController;

import br.com.rocketseat.challenger01.course.modules.useCases.AliveUseCase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/alive")
public class AliveController {

  @Autowired
  private AliveUseCase aliveUseCase;


  @GetMapping("/")
  public String getMethodName() {
    return this.aliveUseCase.execute();
  }
  
}
