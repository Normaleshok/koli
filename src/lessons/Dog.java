package lessons;

public class Dog extends Animal8 {

    // Поле для хранения голоса животного
    private String voice;

    // Конструктор класса
    public Dog(String voice) {
        this.voice = voice;
    }

    public Dog() {

    }

    // Метод makeEat, который будет выводить сообщение о том, что собака ест
    public void makeEat() {
        System.out.println(voice + " кушает");
    }

    // Главный метод программы
    public static void main(String[] args) {
        // Создаем объект собаки с голосом "Гав-гав!"
        Dog dog = new Dog("Гав-гав!");
    }
}
   
