package Module3.Lesson17.PatternCommand;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(); //создаем пульт управления
        Engine engine = new Engine();   // создаем двигатель

        StartEngine startEngine = new StartEngine(engine); //создаем команду для запуска двигателя
        remoteControl.setCommandToButton(startEngine); // назначаем команду на кнопку на пульте
        remoteControl.buttonPress(); //нажимаем кнопку



    }
}
