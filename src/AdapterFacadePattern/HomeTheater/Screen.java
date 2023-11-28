package AdapterFacadePattern.HomeTheater;

public class Screen {

  public Screen(String subscribe) {
    System.out.println(subscribe);
  }

  public void down() {
    System.out.println("화면을 내립니다.");
  }
  public void up() {
    System.out.println("화면을 올립니다.");
  }
}
