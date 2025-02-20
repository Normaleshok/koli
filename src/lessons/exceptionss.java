package lessons;

public class exceptionss {

    // Главный метод программы
    public static void main(String[] args) {
        try {
            // Пример работы с исключениями
            throw new java.io.IOException("Ошибка ввода-вывода");
        } catch (java.io.IOException e) {
            System.out.println("Поймано исключение IOException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано исключение IllegalArgumentException: " + e.getMessage());
        }
    }
}
