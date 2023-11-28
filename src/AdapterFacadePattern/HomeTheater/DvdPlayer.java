package AdapterFacadePattern.HomeTheater;

public class DvdPlayer {

  private Amplifier amplifier;
  private String movie;
  public DvdPlayer(String subscribe, Amplifier amplifier) {
    System.out.println(subscribe);
    this.amplifier = amplifier;
  }

  public void on() {
    System.out.println("DVD 플레이어를 켭니다.");
  }

  public void play(String movie) {
    this.movie = movie;
    System.out.println(movie + "를 재생합니다.");
  }

  public void off() {
    System.out.println("DVD 플레이어를 끕니다.");
  }

  public void stop() {
    System.out.println(movie + " 재생을 멈춥니다.");
  }

  public void eject() {
    System.out.println(movie + " 디스크를 뺍니다.");
  }
}
