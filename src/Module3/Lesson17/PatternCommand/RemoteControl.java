package Module3.Lesson17.PatternCommand;

/**
 * Класс для пульта, с которого и будем запускать двигатель для прогрева машины:
 */

class RemoteControl{ // ЭТО ОБРАБОТЧИК - ТО ЕСТЬ  ТО, ЧТО МОЖЕТ ПОЛУЧИТЬ НА ВХОД КОМАНДУ И ВЫПОЛНИТЬ ЕЕ
    private Command button;

    public void setCommandToButton(Command command){
        button = command;
    }

    public void buttonPress(){
        button.doComand();
    }
}
