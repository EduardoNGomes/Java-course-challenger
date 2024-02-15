package br.com.rocketseat.challenger01.course.modules.controllers.alive;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/alive")
public class AliveController {

  @GetMapping("/")
  public String getMethodName() {
      return "I'm alive XD";
  }
  
}
