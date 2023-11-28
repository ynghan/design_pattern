package AdapterFacadePattern.HomeTheater;

public class Amplifier {
  private DvdPlayer dvdPlayer;
  private CdPlayer cdPlayer;
  private Tuner tuner;

  public Amplifier(String description) {
    System.out.println(description);
  }

  public void on() {
    System.out.println("사운드 앰프를 켭니다.");
  }

  public void off() {
    System.out.println("사운드 앰프를 끕니다.");
  }


  public void setDvdPlayer(DvdPlayer dvdPlayer) {
    this.dvdPlayer = dvdPlayer;
    System.out.println("앰프를 DVD 입력으로 설정합니다.");
  }

  public void setCdPlayer(CdPlayer cdPlayer) {
    this.cdPlayer = cdPlayer;
  }

  public void setTuner(Tuner tuner) {
    this.tuner = tuner;
  }

  public void setVolume(int volume) {
    System.out.println("앱프 볼륨을 " + volume + "(으)로 설정합니다.");
  }

  public void setStereoSound() {
    System.out.println("앰프를 스테레오 사운드로 설정합니다.");
  }

  public void setSurroundSound() {
    System.out.println("앰프를 서라운드 사운드로 설정합니다.");
  }
}
