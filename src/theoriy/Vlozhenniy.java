package theoriy;

public class Vlozhenniy {

    // Вложенный класс для батареи
    public static class Battery {
        private int chargeLevel;

        // Конструктор для батареи
        public Battery(int chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        // Метод для проверки уровня заряда
        public void checkCharge() {
            System.out.println("Уровень заряда батареи: " + chargeLevel + "%");
        }
    }

    // Поле для батареи автомобиля
    private Battery battery;

    // Конструктор автомобиля, который принимает заряд батареи
    public Vlozhenniy(int chargeLevel) {
        this.battery = new Battery(chargeLevel);
    }

    // Метод для запуска автомобиля
    public void start() {
        System.out.println("Электромобиль заведен.");
        battery.checkCharge();  // Проверка заряда батареи при старте
    }

    // Главный метод
    public static void main(String[] args) {
        // Создаем экземпляр электромобиля с батареей на 80% заряда
        Vlozhenniy electrocar = new Vlozhenniy(80);

        // Запускаем электромобиль
        electrocar.start();
    }
}
