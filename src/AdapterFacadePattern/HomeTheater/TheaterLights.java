package AdapterFacadePattern.HomeTheater;

public class TheaterLights {

  public TheaterLights(String subscribe) {
    System.out.println(subscribe);
  }

  public void off() {

  }
  public void on() {
    System.out.println("조명을 킵니다.");
  }

  public void dim(int i) {
    System.out.println(i + "분 동안 조명을 어둡게 합니다.");
  }
}



