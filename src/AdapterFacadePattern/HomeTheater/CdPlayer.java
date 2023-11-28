package AdapterFacadePattern.HomeTheater;

public class CdPlayer {

  private Amplifier amplifier;

  public CdPlayer(String subscribe, Amplifier amplifier) {
    this.amplifier = amplifier;
    System.out.println(subscribe);
  }

  public void on() {

  }

  public void off() {

  }

  public void stop() {}
  public void play() {}
  public void pause() {}
  public void eject() {}
}
