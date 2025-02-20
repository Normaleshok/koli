package lessons;

public class Cat extends Animal8 {
    private String voice;

    // Конструктор класса
    public Cat(String voice) {
        this.voice = voice;
    }

    public Cat() {

    }

    // Метод makeEat выводит звук животного при еде
    public void makeEat() {
        System.out.println(voice + " кушает");
    }

    public static void main(String[] args) {
        // Создаем экземпляр кота с голосом "Мяу!"
        Cat cat = new Cat("Мяу!");
        // Вызовем метод makeEat
        cat.makeEat();
    }
}
