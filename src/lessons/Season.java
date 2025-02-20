package lessons;

public enum Season {
    SUMMER(30), // температура для лета
    WINTER(-5), // температура для зимы
    AUTUMN(10), // температура для осени
    SPRING(15); // температура для весны

    private int temperature; // Атрибут для хранения температуры

    // Конструктор для перечисления
    Season(int temperature) {
        this.temperature = temperature;
    }

    // Метод для получения температуры
    public int getTemperature() {
        return this.temperature;
    }

    // Переопределение метода toString(), чтобы выводить название сезона
    @Override
    public String toString() {
        return name() + " (" + temperature + "°C)";
    }

//    // Метод для получения перечисления по строковому представлению
//    public static Season valueOf(String name) {
//        return Enum.valueOf(Season.java, name);
//    }
//
//    // Метод для получения всех значений перечисления
//    public static Season[] values() {
//        return Season.values();
//    }
}
