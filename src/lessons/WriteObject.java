package lessons;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        // Создаем объект типа s
        s person1 = new s("Bob", 30);

        // Создаем поток для записи объекта в файл
        try (ObjectOutputStream pos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            // Записываем объект в файл
            pos.writeObject(person1);
            System.out.println("Object written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class s implements java.io.Serializable {
    private String name;
    private int age;

    // Конструктор для создания объекта s
    public s(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Переопределение метода toString для вывода информации о человеке
    @Override
    public String toString() {
        return "s{name='" + name + "', age=" + age + "}";
    }
}
