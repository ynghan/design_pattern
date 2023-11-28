package AdapterFacadePattern.hw4;



public class HomeTheaterTestDrive {
  public static void main(String[] args) {

    MyHWInfo.printInfo();
    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    DvdPlayer dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amp);
    CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater screen");
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvdPlayer, cd, projector, screen, lights, popper);

    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
  }
}
