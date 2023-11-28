package AdapterFacadePattern.HomeTheater;

import java.sql.SQLOutput;

public class Projector {

  private DvdPlayer dvdPlayer;

  public Projector(String subscribe, DvdPlayer dvdPlayer) {
    System.out.println(subscribe);
    this.dvdPlayer = dvdPlayer;
  }

  public void on() {
    System.out.println("프로젝터를 켭니다.");
  }

  public void off() {
    System.out.println("프로젝터를 끕니다.");
  }

  public void tvMode() {

  }

  public void wideScreenMode() {
    System.out.println("프로젝터를 와이드 스크린 모드로 전환합니다.");
  }

  public void setInput(DvdPlayer dvdPlayer) {
    this.dvdPlayer = dvdPlayer;
    System.out.println("프로젝터 입력을 DVD로 설정합니다.");
  }

}
