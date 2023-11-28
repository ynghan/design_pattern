package AdapterFacadePattern.HomeTheater;

public class PopcornPopper {

  public PopcornPopper(String subscribe) {
    System.out.println(subscribe);
  }
  public void on() {
    System.out.println("팝콘 기계 전원을 킵니다.");
  }

  public void off() {
    System.out.println("팝콘 기계 전원을 끕니다.");
  }
  public void pop() {
    System.out.println("팝콘을 튀깁니다.");
  }

}
