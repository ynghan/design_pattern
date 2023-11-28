package AdapterFacadePattern.HomeTheater;

public class Tuner {

  private Amplifier amplifier;

  public Tuner(String description, Amplifier amplifier) {
    this.amplifier = amplifier;
    System.out.println(description);
  }

  public void on() {}

  public void setAmplifier(Amplifier amplifier) {
    this.amplifier = amplifier;
  }

  public void off() {
    System.out.println("Tuner를 끕니다.");
  }

  public void setFm() {}

  public void setFrequency() {}
}
