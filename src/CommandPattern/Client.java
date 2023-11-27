package CommandPattern;

import static CommandPattern.MyHWInfo.printInfo;

public class Client {
  public static void main(String[] args) {

    printInfo();

    Lamp lamp = new Lamp();
    Command lampCommand = new LampOnCommand(lamp);
    Button button = new Button(lampCommand);
    button.pressed();

    Alarm alarm = new Alarm();
    Command alarmCommand = new AlarmOnCommand(alarm);
    Button button2 = new Button(alarmCommand);
    button2.pressed();

    button2.setCommand(lampCommand);
    button2.pressed();

  }
}
