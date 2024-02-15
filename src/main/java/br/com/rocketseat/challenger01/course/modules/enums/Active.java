package br.com.rocketseat.challenger01.course.modules.enums;


public enum Active {
  ON("actived"),
  OFF("disabled");


  private String state;

  Active(String state){
    this.state = state;
  }

  public String getState(){
    return this.state;
  }
}
